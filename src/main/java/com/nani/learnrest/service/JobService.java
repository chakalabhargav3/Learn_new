package com.nani.learnrest.service;

import com.nani.learnrest.model.JobPost;
import com.nani.learnrest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepo jobrepo;


    public void addJob(JobPost jobPost){
        jobrepo.addJob(jobPost);
    }

    public List<JobPost> getAll(){
            return jobrepo.getAll();
    }
}
