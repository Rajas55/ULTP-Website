package LaptopOnRent.UlkaEnterprises.Service;

import LaptopOnRent.UlkaEnterprises.Model.admin;
//import LaptopOnRent.UlkaEnterprises.Repository.adminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

//@Service
//public class AdminService {
//    @Autowired
////    private adminRepository adminRepository;
////    @Autowired
////    private fileRepository fileRepository;
//
//    public admin save(admin admin){
//        adminRepository.save(admin);
//        return admin;
//    }
//
//
//    public List<admin> listAll(){
//        return (List<admin>) adminRepository.findAll();
//    }
//
//    public admin get(Integer id) throws UserNotFoundException {
//       Optional<admin> edit =  adminRepository.findById(id);
//        if (edit.isPresent()){
//          return edit.get();
//      }
//        throw new UserNotFoundException("Text not found");
//    }
////    public String uploadImage(MultipartFile multipartFile) throws IOException{
////
////        admin admin = fileRepository.save(LaptopOnRent.UlkaEnterprises.Model.admin.builder());
////    }
//}
