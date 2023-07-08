package LaptopOnRent.UlkaEnterprises;

import LaptopOnRent.UlkaEnterprises.Model.admin;
import LaptopOnRent.UlkaEnterprises.Repository.adminRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class AdminRepositoryTests {
    @Autowired
   private adminRepository adminRepo;
//    @Test
//    public void addnew(){
//        admin admin = new admin();
//        admin.setOffer_text("Hi this is text");
//      admin savedText = adminRepo.save(admin);
//
//        Assertions.assertThat(savedText).isNotNull();
//
//    }
}
