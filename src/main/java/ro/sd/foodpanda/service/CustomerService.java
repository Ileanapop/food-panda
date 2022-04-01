package ro.sd.foodpanda.service;

import ro.sd.foodpanda.dto.CustomerDTO;
import ro.sd.foodpanda.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sd.foodpanda.repository.CustomerRepository;
import ro.sd.foodpanda.utils.CustomerMapper;

import javax.transaction.Transactional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public CustomerDTO getCustomerByUsername(String username){
        return null;
    }

    @Transactional
    public CustomerDTO addCustomer(CustomerDTO customerDTO, LoginDTO loginDTO){
        CustomerMapper customerMapper = new CustomerMapper();
        return customerMapper.convertToDTO(customerRepository.save(customerMapper.convertFromDTO(customerDTO,loginDTO)));
    }

}
