package ro.sd.foodpanda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ro.sd.foodpanda.repository.AdministratorRepository;
import ro.sd.foodpanda.service.AdministratorService;

@Configuration
@SpringBootApplication
public class FoodPandaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodPandaApplication.class, args);
    }


}
