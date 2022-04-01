package ro.sd.foodpanda.controller;

import ro.sd.foodpanda.dto.AdministratorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ro.sd.foodpanda.service.AdministratorService;

@RestController
public class AdministratorLoginController {

    @Autowired
    private AdministratorService administratorService;

    @GetMapping("/login/{username}")
    @ResponseStatus(HttpStatus.OK)
    public AdministratorDTO getCustomerByUsername(@PathVariable String username){

        System.out.println("Authentication started for" + username);
        //return administratorService.getAdministratorByUsername(username);
        return null;
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public AdministratorDTO saveUser(@RequestBody AdministratorDTO administratorDTO){
        System.out.println("*********************");
        return administratorService.addAdministrator(administratorDTO);
    }

    @RequestMapping("/")
    public String index(){
        return "start";
    }
}
