package lk.ijse.gdse.hello_shoe_pvt_ltd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "supplier")
public class SupplierEntity implements SuperEntity{
    @Id
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

    @OneToMany(mappedBy = "supplierEntity")
    private List<InventoryEntity> inventories;
}
