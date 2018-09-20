# 简介

1.学习本篇博文，我们知道在什么场景下使用策略模式。
2.策略模式的优缺点。
3.策略模式的思想。

# 场景

 某公司需要每个周五每名员工都要提交周报，在该公司可以提交周报的行为或者“算法”有：邮箱提交、SVN、Git后两种一般是开发部门使用的(刚开始还没有Git提交方式)。
 那么在该场景中我们是如何设计业务逻辑呢？

 你可能这么想，我用继承的方式多好，在一个超类中都定义有邮箱提交，SVN提交，然后具体角色去继承，然后分别实现这些方法，在进行调用。
 但是你是不是忽略了一个问题，一个人事部门的前台小姐姐并不会SVN提交方式，你确实给她也拥有这样的方式了，这不是明显的设计漏洞吗？
 而且当你使用这样的方式的时候，如果开发部门经理，又提出新的想法添加了Git提交方式，那么你是不是需要修改了很多代码了呢？牵一发而动全身啊
 子类的代码重复到你崩溃了，而且很多部门使用的提交方式不同，我们并不需要知道其他部门的提交方式等等。
 所以继承很难解决我们现在的问题了。

 那么我们应该怎么设计呢？
 答案就是下文

# 分析

## 什么是策略模式？

  策略模式是：定义了算法族，分别封装起来，让其相互替换，相互独立，为达到算法动态修改的角色提供了独立。


## 为什么需要策略模式？

 1.从定义可以看出策略模式是定义了行为“算法”族，将其封装起来，给用户使用的，如果算法改变，那么只需添加或者修改算法方式便能解决问题了，而无需修改其他原有的行为“算法”，因为他们是相互独立的。
 2.对客户隐藏具体行为“算法”的实现细节，彼此之间相互独立。
 3.我们的场景需要完全符合策略模式，封装了不同的提交行为“算法”。

## 进入代码分析

> 我们先来看一下这个UML类图进行分析

![stategy.png](https://upload-images.jianshu.io/upload_images/3012005-b7dcbc207bffa21b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/600)


> 具体实现步骤

1.定义一个行为“算法”，该行为“算法”是一个抽象类或者是接口
2.各种独立的行为去实现该行为“算法”接口
3.定义一个角色，是一个抽象超类或者接口
4.超类角色里面有一个封装的行为或者是“算法”的属性
5.定义一个方法进行委托该行为或者“算法”
6.具体的角色继承超类角色，并实现抽象方法


> 具体代码分析

SubmissionBehavior 接口
```
/**
 * Author Eirunye
 * Created by on 2018/8/31.
 * Describe 定义了一个提交的行为称为一簇"算法"
 * 这可以是一个抽象类火或者是一个接口
 */
public interface SubmissionBehavior {

     void commit();
}
```

MailCommitBehavior.class

```
/**
 * Author Eirunye
 * Created by on 2018/8/31.
 * Describe 邮箱提交行为
 */
public class MailCommitBehavior implements SubmissionBehavior{
    @Override
    public void commit() {
        System.out.println("邮箱提交周报行为");
    }
}
```
Character.class 抽象类
```
/**
 * Author Eirunye
 * Created by on 2018/8/31.
 * Describe 定义一个抽象超类角色
 * 或者这里也可以是接口
 */
public abstract class Character {

    //一个角色有一个这样的行为
    public SubmissionBehavior submissionBehavior;

    public abstract void display();

    //完成提交行为 委托
    public void completeCommit(){
        submissionBehavior.commit();
    }

    //动态设置行为
    public void setSubmissionBehavior(SubmissionBehavior submissionBehavior) {
        this.submissionBehavior = submissionBehavior;
    }
}

```
Coder.class 具体的角色
```
/**
 * Author Eirunye
 * Created by on 2018/8/31.
 * Describe 开发员
 */
public class Coder extends Character{

    public Coder() {
        submissionBehavior = new SVNCommitBehavior();
    }

    @Override
    public void display() {
        System.out.println("刚开始使用的周报提交方式是SVN");
    }
}
```
> 测试

Test.class
```
/**
 * Author Eirunye
 * Created by on 2018/8/31.
 * Describe 测试
 */
public class Test {

    public static void main(String[] args) {
        //创建一个码农提交方式
        Character character = new Coder();
        character.completeCommit();

        //创建一个前台小姐姐提交方式
        Character character1 = new ReceptionSister();
        character1.completeCommit();

        //某天开发部们经理说了以后开发部要统一使用Git方式提交周报了，
        //那么如下看看发生什么情况
        Character character2 = new Coder();
        character2.setSubmissionBehavior(new GitCommitBehavior());//动态设置提交方式
        character2.completeCommit();
    }
}
```
> 输出结果：
```
C:\Java\jdk1.8.0_161\bin\...
SVN提交行为
邮箱提交周报行为
新增的Git提交周报行为

Process finished with exit code 0
```
## 下载

**[策略模式案例代码](https://github.com/eirunye/StrategyPattern_Design)**

# 总结

我们学习了策略模式，在生活中是经常运用到的，本例只是一个场景。
我们在设计开发的时候一定要“多用组合，少用继承”。
针对接口变成，而不针对实现编程。

> 优点

1.策略模式提供了管理相关的算法族的办法。策略类的等级结构定义了一个算法或行为族。通过使用继承抽象超类可以把公共的代码转移到抽象超类父类里面，从而避免重复的代码。
2.通过实现接口的方式定义具体的行为“算法”，从而减少子类继承父类相互混淆的行为。
3.使用策略模式可以避免使用多重条件转移语句，动态的改变行为，而各个具体角色行为“算法”相互独立。

> 缺点

1.客户端必须知道所有的具体角色，并决定使用哪个算法族，这样在设计开始时是需要花费时间是封装“算法”族的，策略模式只适用于客户端知道所有的算法或行为的情况。
2.策略模式造成很多具体的角色，每个具体角色就得创建一个新的类，这样类无法相互联系，所以无法共享。

# [我的GitHub博客](https://eirunye.github.io/)

### [设计模式](https://eirunye.github.io/categories/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/)

大家可以进入这里学习**[设计模式](https://eirunye.github.io/categories/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/)**