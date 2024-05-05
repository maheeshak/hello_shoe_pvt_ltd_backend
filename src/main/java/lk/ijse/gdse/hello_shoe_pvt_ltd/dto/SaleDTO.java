package lk.ijse.gdse.hello_shoe_pvt_ltd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SaleDTO implements SuperDTO{
    private String order_id;
    private double total_price;
    private Timestamp purchase_date;
    private String payment_method;
    private double added_points;
    private String cashier_name;
    private CustomerDTO customer;
}
