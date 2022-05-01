package pl.jsulkowski.project_social_app.users.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserEndpoint {

    UserEndpoint(){}

    @GetMapping("/java")
    public String userJava(){
        return "Java";
    }
}
