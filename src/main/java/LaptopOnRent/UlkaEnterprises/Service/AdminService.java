package LaptopOnRent.UlkaEnterprises.Service;

import LaptopOnRent.UlkaEnterprises.Model.admin;
import LaptopOnRent.UlkaEnterprises.Repository.adminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private adminRepository adminRepository;

    public void save(admin admin){
        adminRepository.save(admin);
    }


//    public admin get(Integer id) throws UserNotFoundException {
//      Optional<admin> edit =  adminRepository.findById(id);
//      if (edit.isPresent()){
//          return edit.get();
//      }
//      throw new UserNotFoundException("Text not found");
//    }
    public List<admin> listAll(){
        return (List<admin>) adminRepository.findAll();
    }

    public admin get(Integer id) throws UserNotFoundException {
       Optional<admin> edit =  adminRepository.findById(id);
        if (edit.isPresent()){
          return edit.get();
      }
        throw new UserNotFoundException("Text not found");
    }

}
