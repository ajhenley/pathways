package com.byaj.pathways.controllers;

import com.byaj.pathways.models.Job;
import com.byaj.pathways.repositories.JobRepository;
import org.apache.tomcat.util.digester.ArrayStack;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/jobdetail/{id}")
    public String showdetail(@PathVariable("id") int id, Model model)
    {
        // TODO: Handle a wrong id
        // TODO: Handle display for education required
        // TODO: Handle dispay for experience required
        Job job = jobRepository.findById(id).get();
        String bob = job.getPayrange();

        JSONParser parser = new JSONParser();
        String json = job.getDuties();
        try {
            Object obj = parser.parse(json);
            JSONArray jo = (JSONArray) obj;
            System.out.println(obj);
//            for(int i = 0; i < jo.size(); i++)
//            {
//
//            }
            model.addAttribute("duties", jo);
        } catch (ParseException pe)
        {
            System.out.println(pe);
            model.addAttribute("duties", new ArrayList<String>());
        }

        parser = new JSONParser();
        json = job.getPayrange();
        json = json.replace("- #", "-#").replace("-#", "");
        try
        {
            Object obj = parser.parse(json);
//            JSONArray jo = (JSONArray) obj;
            model.addAttribute("payrange", obj);
        } catch (ParseException pe)
        {
            System.out.println(pe);
            model.addAttribute("payrange", new ArrayList<String>());
        }

        parser = new JSONParser();
        json = job.getRelatedoccsshort();
        try
        {
            Object obj = parser.parse(json);
            JSONArray jo = (JSONArray) obj;
            model.addAttribute("occsShort", jo);
        } catch (ParseException pe)
        {
            System.out.println(pe);
            model.addAttribute("occsShort", new ArrayList<String>());
        }

        parser = new JSONParser();
        json = job.getRelatedoccslong();
        try
        {
            Object obj = parser.parse(json);
            JSONArray jo = (JSONArray) obj;
            model.addAttribute("occsLong", jo);
        } catch (ParseException pe)
        {
            System.out.println(pe);
            model.addAttribute("occsLong", new ArrayList<String>());
        }

        parser = new JSONParser();
        json = job.getRelatedoccssupplemental();
        try
        {
            Object obj = parser.parse(json);
            JSONArray jo = (JSONArray) obj;
            model.addAttribute("occsSupple", jo);
        } catch (ParseException pe)
        {
            System.out.println(pe);
            model.addAttribute("occsSupple", new ArrayList<String>());
        }

        model.addAttribute("job", job);

        String longdescription = job.getLongdescription().replace((char) 10, '~');
        longdescription = longdescription.replace("~", "<br>");
        model.addAttribute("longdescription", longdescription);
        return "jobdetail";
    }

    @RequestMapping("/jobdetail2/{code}")
    public String showDetailByCode(@PathVariable("code") String code)
    {
        // TODO: Handle a wrong code
        Job job = jobRepository.findByOnetsoccode(code).get();
        return "redirect:/jobdetail/" + job.getId();
    }
}
