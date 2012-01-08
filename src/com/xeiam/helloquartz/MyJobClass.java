package com.xeiam.helloquartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJobClass implements Job {

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {

        System.out.println("MyJobClass is executing.");
    }

}
