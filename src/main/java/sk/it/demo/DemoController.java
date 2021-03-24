package sk.it.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoController {

    @RequestMapping("/")
    public String demo() {
        return "Ubuntu-UserManagement works!";
    }
}
