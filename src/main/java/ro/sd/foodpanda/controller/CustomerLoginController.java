package ro.sd.foodpanda.controller;

import ro.sd.foodpanda.dto.CustomerDTO;
import ro.sd.foodpanda.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ro.sd.foodpanda.service.CustomerService;

@RestController
@RequestMapping("api/customer/login")
public class CustomerLoginController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{username}")
    @ResponseStatus(HttpStatus.OK)
    public CustomerDTO getCustomerByUsername(@PathVariable String username){

        System.out.println("Authentication started for" + username);
        return customerService.getCustomerByUsername(username);
    }

    @PostMapping("/createAccount")
    @ResponseStatus(HttpStatus.OK)
    public CustomerDTO saveUser(@RequestBody CustomerDTO customerDTO, @RequestBody LoginDTO loginDTO){
        return customerService.addCustomer(customerDTO,loginDTO);
    }

}
