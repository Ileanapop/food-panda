package ro.sd.foodpanda.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ro.sd.foodpanda.model.Users.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator,Integer> {


}
