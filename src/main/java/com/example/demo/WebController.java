/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to my web app!");
        model.addAttribute("message2", "Hello World!");
        return "index";
    }
    
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("message", "Welcome to my web app!");
        model.addAttribute("message2", "Hello World!");
        return "about";
    }
}