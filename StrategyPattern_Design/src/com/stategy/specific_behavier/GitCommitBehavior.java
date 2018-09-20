package com.stategy.specific_behavier;

import com.stategy.behavior.SubmissionBehavior;

/**
 * Author Eirunye
 * Created by on 2018/8/31.
 * Describe 定义具体Git提交行为
 */
public class GitCommitBehavior implements SubmissionBehavior {
    @Override
    public void commit() {
        System.out.println("新增的Git提交周报行为");
    }
}
