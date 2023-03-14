package com.wildcodeschool.DoctorWho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    @GetMapping("/doctor/1")
    @ResponseBody
    public String doc1() {
        return "William Hartnell";
    }
    @GetMapping("/doctor/10")
    @ResponseBody
    public String doc10() {
        return "David Tennant";
    }
    @GetMapping("/doctor/13")
    @ResponseBody
    public String doc13() {
        return "Jodie Whittaker";
    }
}

// /doctor/1 : la page affiche "William Hartnell"
// /doctor/10 : la page affiche "David Tennant"
// /doctor/13 : la page affiche "Jodie Whittaker"
