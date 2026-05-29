package com.nani.learnrest.controller;

import com.nani.learnrest.model.JobPost;
import com.nani.learnrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping("/getAll")
//    @ResponseBody
    public List<JobPost> getAll(){
        return jobService.getAll();
    }

    @PostMapping("/addJob")
    public String addJobPost(@RequestBody JobPost jp){
        jobService.addJob(jp);
        return "Job Post added";
    }

    @PutMapping("/updateJob")
    public String updateJobPost(@RequestBody JobPost jp){
        jobService.updateJob(jp);
        return "Job Post updated";
    }

    @DeleteMapping("/delete/{postId}")
    public String deleteJobPost(@PathVariable int postId){
        jobService.deleteJob(postId);
        return "Job Post deleted successfully!";
    }

}
