package com.wildcodeschool.myStringProject.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class MainControllerThirteen {


    @GetMapping("/doctor/13")

    @ResponseBody

    public String index() {

        return "Jodie Whittaker";

    }

}
