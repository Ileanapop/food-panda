package ro.sd.foodpanda.service;

import ro.sd.foodpanda.dto.AdministratorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sd.foodpanda.repository.AdministratorRepository;
import ro.sd.foodpanda.utils.AdministratorMapper;

import javax.transaction.Transactional;

@Service
public class AdministratorService {

    @Autowired
    private AdministratorRepository administratorRepository;

    /*@Autowired
    public AdministratorService(AdministratorRepository administratorRepository){
        this.administratorRepository = administratorRepository;
    }*/

    public AdministratorDTO getAdministratorByUsername(String username){
        return null;
    }

    @Transactional
    public AdministratorDTO addAdministrator(AdministratorDTO administratorDTO){
        AdministratorMapper administratorMapper = new AdministratorMapper();
        return administratorMapper.convertToDTO(administratorRepository.save(administratorMapper.convertFromDTO(administratorDTO)));
    }
}
