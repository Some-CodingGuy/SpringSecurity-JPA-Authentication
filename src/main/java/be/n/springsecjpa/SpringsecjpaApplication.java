package be.n.springsecjpa;

import be.n.springsecjpa.model.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringsecjpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecjpaApplication.class, args);
    }

}
