package LaptopOnRent.UlkaEnterprises.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }

    @GetMapping("/laptops")
    public String showLaptopPage() {
        return "laptop";
    }

    @GetMapping("/workstations")
    public String showWorkStPage() {
        return "workstations";
    }

    @GetMapping("/AboutUs")
    public String showAboutUs() {
        return "aboutus";
    }

    @GetMapping("/MacBook")
    public String showMacBook() {
        return "macBook";
    }

    @GetMapping("/Windows")
    public String showWindowsPage() {
        return "Windows";
    }

    @GetMapping("/Devices")
    public String showDevicesPage() {
        return "Devices";
    }

    @GetMapping("/WorkNest")
    public String showWorkNest() {
        return "workNest";
    }

    @GetMapping("/Repair")
    public String showRepair() {
        return "repair";
    }

    @GetMapping("/Sales")
    public String showSales() {
        return "sales";
    }

    @GetMapping("/Rent")
    public String showRent() {
        return "rent";
    }

    @GetMapping("/House")
    public String showHouse() {
        return "house";
    }

    @GetMapping("/Admin")
    public String showAdmin() {
        return "Admin"; // Optional: Keep or remove this if admin functionality is unnecessary
    }
}
