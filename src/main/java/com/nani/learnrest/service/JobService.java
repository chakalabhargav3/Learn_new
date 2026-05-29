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


    public void updateJob(JobPost jp) {

        for(JobPost job : jobrepo.jobs){

            if(job.getPostId() == jp.getPostId()){

                job.setPostProfile(jp.getPostProfile());
                job.setPostDesc(jp.getPostDesc());
                job.setReqExperience(jp.getReqExperience());
                job.setPostTechStack(jp.getPostTechStack());

            }
        }
    }

    public void deleteJob(int postId){
        jobrepo.deleteJob(postId);
    }



    }

