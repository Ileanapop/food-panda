package ro.sd.foodpanda;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import ro.sd.foodpanda.service.AdministratorService;

@Configuration
@ComponentScan
@EnableJpaRepositories(basePackages = "ro.sd.foodpanda.repository")
public class Application {

    @Bean(name = "aService")
    public AdministratorService administratorService(){
        return  new AdministratorService();
    }

}
