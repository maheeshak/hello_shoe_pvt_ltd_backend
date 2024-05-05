package lk.ijse.gdse.hello_shoe_pvt_ltd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "return_detail")
public class ReturnEntity implements SuperEntity{
    @Id
    private String return_id;
    private Date return_date;
    private String reason;
    private String item_code;
    private String order_id;
    private String size;
    private Integer qty;
}
