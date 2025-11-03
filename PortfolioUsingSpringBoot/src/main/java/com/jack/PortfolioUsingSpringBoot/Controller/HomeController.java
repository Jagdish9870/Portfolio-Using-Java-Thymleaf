package com.jack.PortfolioUsingSpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
        @GetMapping({"/","","/index"})
        public String showHomePage(Model model) {
            model.addAttribute("title","index");
            return "master" ;
        }
        @GetMapping("/projects")
        public String showProjectsPage(Model model) {
            model.addAttribute("title","projects");
            return "master";
        }
        @GetMapping("/contact")
        public String showContactPage(Model model) {
            model.addAttribute("title","contact");
            return "master" ;
        }
        @GetMapping("/resume")
        public String showResumePage(Model model) {
            model.addAttribute("title", "resume");
            return "master" ;
         }
}
