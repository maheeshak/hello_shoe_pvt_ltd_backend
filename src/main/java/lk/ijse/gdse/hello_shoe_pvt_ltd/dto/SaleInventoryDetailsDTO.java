package lk.ijse.gdse.hello_shoe_pvt_ltd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SaleInventoryDetailsDTO implements SuperDTO {
    private Long id;
    private SaleDTO  saleDTO;
    private InventoryDTO inventoryDTO;
    private int size;
    private int item_qty;
    private double selling_price;
}
