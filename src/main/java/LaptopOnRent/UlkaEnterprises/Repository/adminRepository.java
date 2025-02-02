package LaptopOnRent.UlkaEnterprises.Repository;
import LaptopOnRent.UlkaEnterprises.Model.admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.LinkedList;
import java.util.List;

//public interface adminRepository extends CrudRepository <admin, Integer> {
//    @Query(value = "SELECT * FROM ULTP.admin where id=:m",nativeQuery = true)
//    List<admin> getText(@Param("m") Integer id);
//}
