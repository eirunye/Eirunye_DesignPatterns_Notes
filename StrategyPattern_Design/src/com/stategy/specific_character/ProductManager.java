package com.stategy.specific_character;

import com.stategy.character.Character;
import com.stategy.specific_behavier.MailCommitBehavior;

/**
 * Author Eirunye
 * Created by on 2018/8/31.
 * Describe 产品主管
 */
public class ProductManager extends Character{

    public ProductManager() {
        submissionBehavior = new MailCommitBehavior();
    }

    @Override
    public void display() {

        System.out.println("产品主管也是通过邮箱的形式提交");

    }
}
