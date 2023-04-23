package com.byaj.pathways.controllers;

import com.byaj.pathways.models.Job;
import com.byaj.pathways.repositories.JobRepository;
import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashSet;

@Controller
public class HomeController {

    @Autowired
    JobRepository jobRepository;

    @RequestMapping("/")
    public String homePage()
    {
        return "home";
    }

    @RequestMapping("/browse")
    public String browse(Model model)
    {
//        User user = new User("8675309",
//                "ajhenley@gmail.com",
//                "AJ Henley",
//                "https://res.cloudinary.com/learningbycoding/image/upload/v1681420616/headshot_zgrluu.jpg");
//        model.addAttribute("user", user);
//        model.addAttribute("user1", null);

        ArrayList<Job> jobs = (ArrayList<Job>) jobRepository.findAll();
        ArrayList<Job> jobz = new ArrayList<>();
        int i = 0;

        while (i < 8)
        {
            jobz.add(jobs.get(i));
            i++;
        }

        model.addAttribute("nodes", jobz);
        return "browse";
    }
}
