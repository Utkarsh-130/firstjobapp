package com.vmbrox.firstjobapp.job;

import java.util.List;

// interface for loose coupling
public interface JobService {
    List<Job> findall();
    void createJob(Job job);

    Job getJobById(long id);
}
