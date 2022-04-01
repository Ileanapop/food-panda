package ro.sd.foodpanda.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ro.sd.foodpanda.model.Users.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Column;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    Customer findByUsername(String username);

}
