package org.example.springsandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/sandwich")
public class SandwichController {
    @GetMapping("")
    public String viewSandwich() {
        return "index";
    }
    @PostMapping("/view")
    public String viewCondiment(@RequestParam("checkbox") List<String> list, Model model) {
        String condiment="Sandwich with ";
        for(String s : list){
           condiment=condiment+s+",";
        }
        model.addAttribute("condiment",condiment);
        return "view";
    }

}
