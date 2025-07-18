package com.vmbrox.firstjobapp.job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.vmbrox.firstjobapp.job.JobService;
import java.util.ArrayList;
import java.util.List;
@RestController
public class JobController {


    private JobService jobService;
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }
    //making a list to return all the jobs
    private List<Job> jobs=new ArrayList<>();
    @GetMapping("/jobs")
    public List<Job> findall(){
        return jobService.findall();

    }
    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){
    jobs.add(job);
    return "job created ";}
}
