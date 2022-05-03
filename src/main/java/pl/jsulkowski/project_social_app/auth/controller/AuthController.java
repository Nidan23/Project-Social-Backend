package pl.jsulkowski.project_social_app.auth.controller;

import org.springframework.stereotype.Service;
import pl.jsulkowski.project_social_app.auth.model.AuthModel;
import pl.jsulkowski.project_social_app.auth.repository.Auth;
import pl.jsulkowski.project_social_app.auth.repository.AuthRepository;

@Service
public class AuthController {

    private final AuthRepository authRepository;

    public AuthController(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    public boolean checkUser(AuthModel authModel){
        if (authRepository.findByLogin(authModel.getLogin()).isPresent()){
            if(authRepository.findByPassword(authModel.getPassword()).isPresent())
                return true;
        }

        return false;
    }

    public boolean addUser(AuthModel authModel){

        if(!checkUser(authModel)) {
            Auth auth = new Auth(authModel.getLogin(), authModel.getPassword());
            authRepository.save(auth);

            return true;
        }

        return false;
    }
}
