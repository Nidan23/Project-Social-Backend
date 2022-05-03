package pl.jsulkowski.project_social_app.auth.repository;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "credentials")
public class Auth {

    @javax.persistence.Id
    @Id
    private Long userId;

    private String login;
    private String password;

    public Auth(){}

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return userId;
    }

    public void setId(Long id) {
        this.userId = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
