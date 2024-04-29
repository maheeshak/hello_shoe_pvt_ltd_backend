package lk.ijse.gdse.hello_shoe_pvt_ltd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "inventory")
public class InventoryEntity implements SuperEntity {
    @Id
    private String item_code;
    private String item_desc;
    private String item_pic;
    private String gender;
    private String occasion;
    private String variety;

    @ManyToOne
    @JoinColumn(name = "supplier_code", referencedColumnName = "supplier_code")
    private SupplierEntity supplierEntity;





}
