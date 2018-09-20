package com.stategy.specific_character;
import com.stategy.character.Character;
import com.stategy.specific_behavier.MailCommitBehavior;

/**
 * Author Eirunye
 * Created by on 2018/8/31.
 * Describe 前台小姐姐具体角色
 */
public class ReceptionSister extends Character{

    public ReceptionSister() {
        submissionBehavior = new MailCommitBehavior();
    }

    @Override
    public void display() {
        System.out.println("前台小姐用的提交周报的方式是邮箱提交给人事部门老大");
    }
}
