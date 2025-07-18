package com.vmbrox.firstjobapp.job;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> findall() {
        return jobService.findall();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return "Job created successfully";
    }
    @GetMapping("/jobs/{id}")
    public Job getJobById(@PathVariable long id) {
        Job job= jobService.getJobById(id);

    }
}
