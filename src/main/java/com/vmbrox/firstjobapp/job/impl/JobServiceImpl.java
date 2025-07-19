package com.vmbrox.firstjobapp.job.impl;

import com.vmbrox.firstjobapp.job.Job;
import com.vmbrox.firstjobapp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
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
    @Override
    public boolean deleteJobById(Long id){
        Iterator<Job>iterator= jobs.iterator();
        while(iterator.hasNext()){
            Job job=iterator.next();
            if(job.getId()==id){
                iterator.remove();
                return true;
            }
        }
        return false ;
    }

    @Override
    public boolean updateJob(Long id, Job updatedJob) {
        for (Job job : jobs) {
            if (job.getId() == id) {
                job.setTitle(updatedJob.getTitle());
                job.setDescription(updatedJob.getDescription());
                job.setMinSalary(updatedJob.getMinSalary());
                job.setMaxSalary(updatedJob.getMaxSalary());
                job.setLocation(updatedJob.getLocation());
                return true;
            }
        }
        return false;
    }
}
}