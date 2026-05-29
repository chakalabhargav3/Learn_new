package com.nani.learnrest.repo;

import com.nani.learnrest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class JobRepo {

   public List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java Developer","Must have good experience in core Java and Spring Boot",2,Arrays.asList("Java","Spring Boot","Hibernate","MySQL")),
            new JobPost(2,"Frontend Developer","Experience in building responsive web applications",1,Arrays.asList("HTML","CSS","JavaScript","Angular")),
            new JobPost(3,"Data Scientist","Strong background in machine learning and data analysis",3,Arrays.asList("Python","Machine Learning","SQL","TensorFlow")),
            new JobPost(4,"Network Engineer","Design and implement computer networks",2,Arrays.asList("Networking","Cisco","Linux","Security")),
            new JobPost(5,"Mobile App Developer","Experience in mobile app development",2,Arrays.asList("Android","Java","Kotlin","Firebase"))
    ));
    public List<JobPost> getAll(){
        return jobs;
    }


    public void addJob(JobPost jobPost){
        jobs.add(jobPost);
    }
}

