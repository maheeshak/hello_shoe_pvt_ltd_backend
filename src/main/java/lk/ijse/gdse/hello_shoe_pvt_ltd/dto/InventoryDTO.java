package lk.ijse.gdse.hello_shoe_pvt_ltd.dto;

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
    private int qty_on_hand;
    private String category;
    private int size;
    private String supplier_code;
    private String supplier_name;
    private double selling_price;
    private double buying_price;
    private double expected_profit;
    private double profit_margin;
    private String status;


}
