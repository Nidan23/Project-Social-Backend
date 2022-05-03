package pl.jsulkowski.project_social_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ProjectSocialAppApplication {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(ProjectSocialAppApplication.class, args);
    }

    public void run(String... args) throws Exception {
        String sql = "INSERT INTO students (name, email) VALUES ("
                + "'Nam Ha Minh', 'nam@codejava.net')";

        int rows = jdbcTemplate.update(sql);
        if (rows > 0) {
            System.out.println("A new row has been inserted.");
        }
    }

}
