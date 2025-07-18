package com.vmbrox.firstjobapp.job;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Job {
    private long id;
    private String title;
    private String desciption;
    private String maxSalary;
    private String minSalary;
    private String Location;



}
