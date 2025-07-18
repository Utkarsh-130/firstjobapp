package com.vmbrox.firstjobapp.job.impl;

import com.vmbrox.firstjobapp.job.Job;
import com.vmbrox.firstjobapp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class JobServiceImpl implements JobService {
    private List<Job> jobs =new ArrayList<>();
    @Override
    public List<Job> findall() {
        return jobs;
    }

    @Override
    public void createJob() {

    }
}
