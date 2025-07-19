package com.vmbrox.firstjobapp.job.impl;

import com.vmbrox.firstjobapp.job.Job;
import com.vmbrox.firstjobapp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    private Long nextId = 1L;
    private final List<Job> jobs = new ArrayList<>();

    @Override
    public List<Job> findall() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobs.add(job);
    }

    @Override
    public Job getJobById(Long id) {
        return jobs.stream()
                .filter(job -> job.getId() == id)
                .findFirst()
                .orElse(null);
    }
}