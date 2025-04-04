package org.example.javaweb.controllers;

import org.example.javaweb.model.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController  {
    @Autowired
    DogRepository dogRepository;

    @GetMapping(path="/")
    String empty(Model model)
    {
        model.addAttribute("activeFunction", "home");

        model.addAttribute("dogs", dogRepository.findAll());
        return "dogs";
    }
    @GetMapping(path="/list")
    String list(Model model)
    {
        model.addAttribute("activeFunction", "home");

        model.addAttribute("dogs", dogRepository.findAll());
        return "list";
    }


}
