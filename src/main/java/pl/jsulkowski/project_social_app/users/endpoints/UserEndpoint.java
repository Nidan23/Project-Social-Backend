package pl.jsulkowski.project_social_app.users.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jsulkowski.project_social_app.users.controller.UserController;
import pl.jsulkowski.project_social_app.users.repository.User;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserEndpoint {

    private final UserController userController;
    UserEndpoint(UserController userController){
        this.userController = userController;
    }

    @PostMapping("/POST")
    public String userJava(){
        return "Java";
    }

    @GetMapping("/GET")
    public String getUser(){
        return "New user";
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userController.getAllUsers();
    }
}
