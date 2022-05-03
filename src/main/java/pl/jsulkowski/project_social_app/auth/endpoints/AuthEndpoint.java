package pl.jsulkowski.project_social_app.auth.endpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jsulkowski.project_social_app.auth.controller.AuthController;
import pl.jsulkowski.project_social_app.auth.model.AuthModel;

@RestController
@RequestMapping("/authentication")
public class AuthEndpoint {
    private final AuthController authController;

    AuthEndpoint(AuthController authController){
        this.authController = authController;
    }

    @PostMapping("/login")
    public String login(@RequestBody AuthModel authModel){
        if(authController.checkUser(authModel))
            return "Zalogowano";

        return "Błędny login lub hasło";
    }

    @PostMapping("/register")
    public String register(@RequestBody AuthModel authModel){
        if(authController.addUser(authModel))
            return "Utworzono użytkownia";

        return "Użytkownik o takim samym loginie już istnieje";
    }
}
