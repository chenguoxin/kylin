package com.kylinolap.job2;

import com.kylinolap.job2.BaseTestExecutable;
import com.kylinolap.job2.dao.JobOutputPO;
import com.kylinolap.job2.dao.JobPO;
import com.kylinolap.job2.exception.ExecuteException;
import com.kylinolap.job2.execution.ExecutableContext;
import com.kylinolap.job2.execution.ExecuteResult;

/**
 * Created by qianzhou on 12/22/14.
 */
public class ErrorTestExecutable extends BaseTestExecutable {

    public ErrorTestExecutable() {
    }

    public ErrorTestExecutable(JobPO job) {
        super(job);
    }

    @Override
    protected ExecuteResult doWork(ExecutableContext context) throws ExecuteException {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        throw new RuntimeException("test error");
    }
}
