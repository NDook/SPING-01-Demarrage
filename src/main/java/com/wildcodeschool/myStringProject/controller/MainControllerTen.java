package com.wildcodeschool.myStringProject.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class MainControllerTen {


    @GetMapping("/doctor/10")

    @ResponseBody

    public String index() {

        return "David Tennant";

    }

}
