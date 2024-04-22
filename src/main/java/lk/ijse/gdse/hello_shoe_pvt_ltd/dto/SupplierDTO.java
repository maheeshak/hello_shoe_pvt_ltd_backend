package lk.ijse.gdse.hello_shoe_pvt_ltd.dto;

import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SupplierDTO implements SuperDTO {
    private String supplier_code;
    private String supplier_name;
    private Category category;
    private String building_no;
    private String lane;
    private String city;
    private String state;
    private String postal_code;
    private String country;
    private String contact_01;
    private String contact_02;
    private String email;
}
