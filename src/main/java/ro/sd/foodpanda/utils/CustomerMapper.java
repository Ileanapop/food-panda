package ro.sd.foodpanda.utils;

import ro.sd.foodpanda.dto.CustomerDTO;
import ro.sd.foodpanda.dto.LoginDTO;
import ro.sd.foodpanda.model.Users.Customer;

public class CustomerMapper {

    public Customer convertFromDTO(CustomerDTO customerDTO, LoginDTO loginDTO){
        Customer customer = new Customer();

        customer.setEmail(customer.getEmail());
        customer.setFirstName(customer.getFirstName());
        customer.setLastName(customerDTO.getLastName());
        customer.setUsername(loginDTO.getUsername());
        customer.setPassword(loginDTO.getPassword());
        return customer;
    }

    public CustomerDTO convertToDTO(Customer customer){

       CustomerDTO customerDTO = new CustomerDTO();
       customerDTO.setEmail(customer.getEmail());
       customerDTO.setFirstName(customer.getFirstName());
       customerDTO.setLastName((customer.getLastName()));
       return customerDTO;
    }

    public LoginDTO convertLoginToDTO(Customer customer){

        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setPassword(customer.getPassword());
        loginDTO.setUsername(customer.getUsername());
        return loginDTO;
    }


}
