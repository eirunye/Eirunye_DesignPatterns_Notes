package com.stategy.specific_behavier;

import com.stategy.behavior.SubmissionBehavior;

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
