package com.nani.learnrest.controller;

import com.nani.learnrest.model.JobPost;
import com.nani.learnrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    JobService jobService;

    @RequestMapping("/getAll")
//    @ResponseBody
    public List<JobPost> getAll(){
        return jobService.getAll();
    }

}
