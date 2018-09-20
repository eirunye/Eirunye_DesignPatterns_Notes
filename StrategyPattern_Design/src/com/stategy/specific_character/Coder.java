package com.stategy.specific_character;

import com.stategy.character.Character;
import com.stategy.specific_behavier.SVNCommitBehavior;

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
