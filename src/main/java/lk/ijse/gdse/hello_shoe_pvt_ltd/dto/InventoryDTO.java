package lk.ijse.gdse.hello_shoe_pvt_ltd.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InventoryDTO implements SuperDTO{
    private String item_code;
    private String item_desc;
    private String item_pic;
    private String gender;
    private String occasion;
    private String variety;

    @ManyToOne
    @JoinColumn(name = "supplier_code", referencedColumnName = "supplier_code")
    private SupplierDTO supplierDTO;


}
