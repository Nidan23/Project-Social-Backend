package pl.jsulkowski.project_social_app.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthRepository extends JpaRepository<Auth, Integer> {
    Optional<Auth> findByLogin(String login);

    Optional<Auth> findByPassword(String password);
}
