package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.CustomerDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.InventoryDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/inventory")
@RequiredArgsConstructor
public class Inventory {
    private final InventoryService inventoryService;
    @GetMapping("/health")
    public String healthCheck(){

        return "Hello I'm inventory controller and I'm okay!";
    }
    @PostMapping
    public boolean saveInventory(@RequestBody InventoryDTO inventoryDTO){
        return inventoryService.saveInventory(inventoryDTO);

    }

    @PutMapping
    public boolean updateInventory(@RequestBody InventoryDTO inventoryDTO){
        return inventoryService.updateInventory(inventoryDTO);
    }

    @DeleteMapping
    public boolean deleteInventory(@RequestParam String item_code){
        return inventoryService.deleteInventory(item_code);
    }

    @GetMapping("/find")
    public InventoryDTO searchInventory(@RequestParam String item_code){
        System.out.println(item_code);
        InventoryDTO inventoryDTO = new InventoryDTO();
        inventoryDTO.setItem_code(item_code);
        return inventoryDTO;

    }

    @GetMapping
    public InventoryDTO getAllInventories(){

        InventoryDTO inventoryDTO = new InventoryDTO();
        inventoryDTO.setItem_code("I001");
        inventoryDTO.setItem_desc("leather");

        return inventoryDTO;
    }





}
