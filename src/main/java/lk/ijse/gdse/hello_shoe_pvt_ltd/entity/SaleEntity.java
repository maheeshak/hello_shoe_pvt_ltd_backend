package lk.ijse.gdse.hello_shoe_pvt_ltd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "sale")
public class SaleEntity implements SuperEntity{
    @Id
    private String order_id;
    private String item_code;
    private String customer_name;
    private String item_desc;
    private int size;
    private double unit_price;
    private int item_qty;
    private double total_price;
    private Timestamp purchase_date;
    private String payment_method;
    private double added_points;
    private String cashier_name;
}
