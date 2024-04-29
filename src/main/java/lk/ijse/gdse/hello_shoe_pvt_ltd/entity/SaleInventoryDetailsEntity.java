package lk.ijse.gdse.hello_shoe_pvt_ltd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sale_inventory_details")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SaleInventoryDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private SaleEntity saleEntity;

    @ManyToOne
    @JoinColumn(name = "item_code", referencedColumnName = "item_code")
    private InventoryEntity inventoryEntity;


    private int size;
    private int item_qty;
    private double selling_price;
    private String status;
}
