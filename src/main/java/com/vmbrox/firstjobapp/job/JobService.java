package com.vmbrox.firstjobapp.job;

import java.util.List;

// interface for loose coupling
public interface JobService {
    List<Job> findAll();

    List<Job> findall();
    void createJob(Job job);

    Job getjulJobById(long id);

    Job getJobById(long id);

    Job getJobById(Long id);
}
  