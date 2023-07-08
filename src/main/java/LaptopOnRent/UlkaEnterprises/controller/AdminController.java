package LaptopOnRent.UlkaEnterprises.controller;

import LaptopOnRent.UlkaEnterprises.Model.admin;
import LaptopOnRent.UlkaEnterprises.Repository.adminRepository;
import LaptopOnRent.UlkaEnterprises.Service.AdminService;
import LaptopOnRent.UlkaEnterprises.Service.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private adminRepository adminRepository;


    @Autowired
    private AdminService service;

//    @GetMapping("/admin")
//    public String showAdminPage(Model model){
//        model.addAttribute("admin",new admin());
//        return "admin";
//    }
    @PostMapping("/admin/save")
    public String SaveOfferH(admin admin, RedirectAttributes redirectAttributes ){
        service.save(admin);
        redirectAttributes.addFlashAttribute("message","The text has been saved successfully! It will be updated on the website shortly.");
        return "redirect:/admin";
    }

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
