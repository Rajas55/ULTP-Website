package LaptopOnRent.UlkaEnterprises.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.relational.core.sql.In;

@Getter // Just adding lombok dependency you can avoid the boilerplate codes for ex. getters and setters.
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Admin")
public class admin {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "Id",nullable = false,unique = true)
    private Integer id;


    @Column(name = "offer_head",nullable = true)//specify column name and null or no.
    private String offer_head;

    @Column(name = "offer_price",nullable = true)
    private String offer_price;
    @Column(name = "offer_body",nullable = true)
    private String offer_body;

    @Override
    public String toString() {
        return "user{" +
                "user_id=" + id +
                ", offerT='" + offer_head + '\'' +
                ", offerP='" + offer_price + '\'' +
                ", offerB='" + offer_body + '\'' +
                '}';
    }
}
