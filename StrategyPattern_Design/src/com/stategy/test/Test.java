package com.stategy.test;

import com.stategy.character.Character;
import com.stategy.specific_behavier.GitCommitBehavior;
import com.stategy.specific_character.Coder;
import com.stategy.specific_character.ReceptionSister;

/**
 * Author Eirunye
 * Created by on 2018/8/31.
 * Describe 测试
 */
public class Test {

    public static void main(String[] args) {

        Character character = new Coder();
        character.completeCommit();

        Character character1 = new ReceptionSister();
        character1.completeCommit();

        //某天开发部们经理说了以后开发部要统一使用Git方式提交周报了，
        //那么如下看看发生什么情况
        Character character2 = new Coder();
        character2.setSubmissionBehavior(new GitCommitBehavior());//动态设置提交方式
        character2.completeCommit();
    }
}
