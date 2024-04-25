package lk.ijse.gdse.hello_shoe_pvt_ltd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SizeDTO implements SuperDTO{
    private String size_id;
    private int size;
    private String category;
}
