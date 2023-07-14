package LaptopOnRent.UlkaEnterprises;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MvcConfig implements WebMvcConfigurer {
//    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        Path photoUploadDir = Paths.get("/Users/rajasyardi/UlkaEnterprises/user-photos");
//        String photoUploadPath  = photoUploadDir.toFile().getAbsolutePath();
//        registry.addResourceHandler("/Users/rajasyardi/UlkaEnterprises/user-photos/**")
//                .addResourceLocations("file:/" + photoUploadPath + "/");
//
//
//
        Path productUploadDir = Paths.get("/Users/rajasyardi/UlkaEnterprises/src/main/resources/static/images");
//        String productUploadPath = productUploadDir.toFile().getAbsolutePath();
        registry.addResourceHandler("/Users/rajasyardi/UlkaEnterprises/src/main/resources/static/images/1/**");



    }
}
