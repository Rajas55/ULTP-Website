package LaptopOnRent.UlkaEnterprises.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

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
}
