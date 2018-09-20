package com.stategy.specific_behavier;

import com.stategy.behavior.SubmissionBehavior;

/**
 * Author Eirunye
 * Created by on 2018/8/31.
 * Describe SVN 提交行为
 */
public class SVNCommitBehavior implements SubmissionBehavior{
    @Override
    public void commit() {
        System.out.println("SVN提交行为");
    }
}
