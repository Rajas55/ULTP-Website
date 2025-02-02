package LaptopOnRent.UlkaEnterprises.controller;

//import LaptopOnRent.UlkaEnterprises.Service.AdminService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.io.IOException;
import java.util.List;

@Controller
public class mainController {
//    @Autowired
//    private AdminService service;


    @GetMapping("/")
    public String showHomePage(){
        return "home";
    }


    @GetMapping("/laptops")
    public String showLaptopPage(){
        return "laptop";

    }

    @GetMapping("/workstations")
    public String showWorkStPage(){
        return "workstations";

    }
    @GetMapping("/AboutUs")
    public String showaboutUs(){
        return "aboutus";

    }
    @GetMapping("/MacBook")
    public String showMacBook(){
        return "macBook";

    }
    @GetMapping("/Windows")
    public String showWindowsPage(){
        return "Windows";

    }
    @GetMapping("/Devices")
    public String showDevicesPage(){
        return "Devices";

    }
    @GetMapping("/WorkNest")
    public String showWorkNest(){
        return "workNest";
    }
    @GetMapping("/Repair")
    public String showRepair(){
        return "repair";
    }
    @GetMapping("/Sales")
    public String showSales(){
        return "sales";
    }
    @GetMapping("/Rent")
    public String showRent(){
        return "rent";
    }
    @GetMapping("/House")
    public String showHouse(){return "house";}
    @GetMapping("/Admin")
    public String showAdmin(){return "Admin";}




    @GetMapping("/redirect")
    public void getRedirect(HttpServletResponse resp, HttpServletRequest request) throws IOException {
       if (request.isUserInRole("ROLE_ADMIN")) {
            resp.sendRedirect("/admin");
        }
    }


}
