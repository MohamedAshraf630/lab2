package demo.demo;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class test {
    @GetMapping("/signup1")
    public String signupform(){
        return "signup.html";
    }
    @PostMapping ("/user")
    public String homePage(@ModelAttribute User user){
        return "redirect:/home.html";
    }
}
