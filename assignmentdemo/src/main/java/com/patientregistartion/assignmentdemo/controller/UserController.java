package com.patientregistartion.assignmentdemo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.patientregistartion.assignmentdemo.entity.PatientDetails;
import com.patientregistartion.assignmentdemo.repository.PatientRepository;

@Controller
public class UserController {

    @Autowired
    private PatientRepository repo;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/index")
    public String index() {
        return "index";

    }

    @GetMapping("/login")
    public String login() {
        return "login";

    }

    @PostMapping("/register")
    public String RegPatient(@ModelAttribute PatientDetails PD, HttpSession session) {

        System.out.println(PD);

        repo.save(PD);

        session.setAttribute("message", "Patient Registration Completed and USERNAME generated");
        return "redirect:/";

    }

}