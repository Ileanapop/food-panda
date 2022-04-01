package ro.sd.foodpanda.utils;

import ro.sd.foodpanda.dto.AdministratorDTO;
import ro.sd.foodpanda.model.Users.Administrator;

public class AdministratorMapper {

    public Administrator convertFromDTO(AdministratorDTO administratorDTO){
        Administrator administrator = new Administrator();

        administrator.setUsername(administrator.getUsername());
        administrator.setPassword(administrator.getPassword());
        return administrator;
    }

    public AdministratorDTO convertToDTO(Administrator administrator){

        AdministratorDTO administratorDTO = new AdministratorDTO();

        administratorDTO.setUsername(administrator.getUsername());
        administratorDTO.setPassword(administrator.getPassword());
        return administratorDTO;
    }

}
