package LaptopOnRent.UlkaEnterprises.controller;

import LaptopOnRent.UlkaEnterprises.Model.admin;
import LaptopOnRent.UlkaEnterprises.Repository.adminRepository;
import LaptopOnRent.UlkaEnterprises.Service.AdminService;
import LaptopOnRent.UlkaEnterprises.Service.UserNotFoundException;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private adminRepository adminRepository;


    @Autowired
    private AdminService service;
//    public String uploadDir ="/Users/rajasyardi/UlkaEnterprises/user-photos";
//    @PostMapping("/admin/save") public String uploadImage(admin admin, @RequestParam("photo1") MultipartFile file,RedirectAttributes redirectAttributes) throws IOException {
//        StringBuilder fileNames = new StringBuilder();
//        Path fileNameAndPath = Paths.get(FOLDER_PATH, file.getOriginalFilename());
//        fileNames.append(file.getOriginalFilename());
//        Files.write(fileNameAndPath, file.getBytes());
//        service.save(admin);
//        redirectAttributes.addFlashAttribute("message","The text has been saved successfully! It will be updated on the website shortly.");
//        return "redirect:/admin";
//
//    }
    @PostMapping("/admin/save/photo")
    public String SaveData(@ModelAttribute(name = "admin") admin admin, RedirectAttributes redirectAttributes, @RequestParam("photo1")
                              MultipartFile multipartFile) throws IOException{
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        admin.setPhoto(fileName);
         admin  savedPhoto = service.save(admin);
         String uploadDir = "/Users/rajasyardi/UlkaEnterprises/user-photos/" + savedPhoto.getId();
          Path uploadPath = Paths.get(uploadDir);
          if (!Files.exists(uploadPath )){
              Files.createDirectories(uploadPath);
          }
          try (InputStream inputStream = multipartFile.getInputStream()){
              Path filePath = uploadPath.resolve(fileName);
              Files.copy(inputStream,filePath,StandardCopyOption.REPLACE_EXISTING);
          } catch (IOException e){
              throw new IOException("File Not Saved");
          }
        redirectAttributes.addFlashAttribute("message","The data has been saved successfully! It will be updated on the website shortly.");
        return "redirect:/admin";
    }
//    @PostMapping("/admin/save/text")
//    public String SaveOfferH(@ModelAttribute(name = "admin") admin admin, RedirectAttributes redirectAttributes) throws IOException{
//        service.save(admin);
//        redirectAttributes.addFlashAttribute("message","The text has been saved successfully! It will be updated on the website shortly.");
//        return "redirect:/admin";
//    }
//
    @GetMapping({"/"})
    public ModelAndView getHomeText() {
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("text", adminRepository.getText(1));
        return mav;
    }
    @GetMapping("/admin")
    public String showList(Model model){
        List<admin> adminList = service.listAll();
        model.addAttribute("adminList",adminList);
        return "admin";

    }
    @GetMapping("/admin/edit/{id}")
    public String showEditPage(@PathVariable("id")Integer id,Model model){
            try {
               admin admins =  service.get(id);
                model.addAttribute("admin",admins);
                return "adminEdit";
            } catch (UserNotFoundException e) {
              return  "redirect:/admin";
            }
    }




}
