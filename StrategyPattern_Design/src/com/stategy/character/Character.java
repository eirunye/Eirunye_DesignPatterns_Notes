package com.stategy.character;

import com.stategy.behavior.SubmissionBehavior;

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
