package be.n.springsecjpa.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {

    @GetMapping("/")
    public String home(){
        return ("<h1> Welcome to the standard home </h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1> Welcome to the user home </h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1> Welcome to the admin home </h1>");
    }
}
