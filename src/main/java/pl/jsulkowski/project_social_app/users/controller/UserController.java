package pl.jsulkowski.project_social_app.users.controller;

import org.springframework.stereotype.Service;
import pl.jsulkowski.project_social_app.users.repository.User;
import pl.jsulkowski.project_social_app.users.repository.UserRepository;

import java.util.List;

@Service
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
