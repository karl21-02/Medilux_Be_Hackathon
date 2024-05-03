package be.project_be.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Testcontroller {

    @GetMapping("/test")
    public String hello() {
        return "/test";
    }
}
