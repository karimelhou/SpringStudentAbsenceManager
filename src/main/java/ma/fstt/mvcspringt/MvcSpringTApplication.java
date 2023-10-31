package ma.fstt.mvcspringt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "ma.fstt.Persistence")
@EnableJpaRepositories(basePackages = "ma.fstt.Repo")
@ComponentScan(basePackages = "ma.fstt.services")
@ComponentScan(basePackages = "ma.fstt.controller")
public class MvcSpringTApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcSpringTApplication.class, args);
    }

}
