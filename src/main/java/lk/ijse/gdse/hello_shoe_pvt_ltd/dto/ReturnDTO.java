package lk.ijse.gdse.hello_shoe_pvt_ltd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReturnDTO implements SuperDTO{
    private String return_id;
    private String order_id;
    private Date return_date;
    private String return_reason;
}
