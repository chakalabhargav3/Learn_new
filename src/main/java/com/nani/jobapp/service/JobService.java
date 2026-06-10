package com.nani.jobapp.service;

import com.nani.jobapp.model.JobPost;
import com.nani.jobapp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepo jobrepo;


    public void addJob(JobPost jobPost){
        jobrepo.save(jobPost);
    }

    public List<JobPost> getAll(){
        return jobrepo.findAll();
    }


    public void updateJob(JobPost jp) {
        List<JobPost> jobs = jobrepo.findAll();
        for(JobPost job : jobs){

            if(job.getPostId() == jp.getPostId()){

                job.setPostProfile(jp.getPostProfile());
                job.setPostDesc(jp.getPostDesc());
                job.setReqExperience(jp.getReqExperience());
                job.setPostTechStack(jp.getPostTechStack());

            }
        }
    }

    public void deleteJob(int postId){
        jobrepo.deleteById(postId);
    }


}
