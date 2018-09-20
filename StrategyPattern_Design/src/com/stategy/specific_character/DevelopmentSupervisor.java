package com.stategy.specific_character;

import com.stategy.character.Character;
import com.stategy.specific_behavier.MailCommitBehavior;

/**
 * Author Eirunye
 * Created by on 2018/8/31.
 * Describe 开发部主管
 */
public class DevelopmentSupervisor extends Character{

    public DevelopmentSupervisor() {
        submissionBehavior =new MailCommitBehavior();
    }

    @Override
    public void display() {
        System.out.println("开发部主管用的是邮箱方式提交周报给部门经理");

    }
}
