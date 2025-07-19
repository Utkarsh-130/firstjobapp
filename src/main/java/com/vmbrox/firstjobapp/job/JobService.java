package com.vmbrox.firstjobapp.job;

import java.util.List;

// interface for loose coupling
public interface JobService {
    boolean deleteJobById(Long id) ;

    List<Job> findall();
    void createJob(Job job);
    Job getJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);

}
  