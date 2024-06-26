package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.InventoryDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SizeInventoryDetailsDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.extra.InventoryDetailsDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.extra.ItemUpdateDetailsDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/inventory")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class Inventory{

    private final InventoryService inventoryService;


    @GetMapping("/health")
    public String healthCheck() {
        return "Hello I'm Inventory Controller. I'm OK! Have a nice day!";
    }


    @PostMapping
    public boolean saveInventory(@RequestBody InventoryDetailsDTO inventoryDetailsDTO) {
        return inventoryService.add(inventoryDetailsDTO);
    }


    public boolean updateInventory(List<SizeInventoryDetailsDTO> inventoryDTO) {
        return false;
    }


    @PutMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public boolean updateInventory(@RequestPart("itemDTO") ItemUpdateDetailsDTO itemUpdateDetailsDTO, @RequestPart("sizeInventoryDetailsDTO") List<SizeInventoryDetailsDTO> sizeInventoryDetailsDTOS) {
        inventoryService.updateDetails(itemUpdateDetailsDTO);
        return inventoryService.update(sizeInventoryDetailsDTOS);
    }


    @DeleteMapping
    public boolean deleteInventory(@RequestParam String item_code) {
        return inventoryService.delete(item_code);
    }


    @GetMapping
    public InventoryDTO searchInventory(@RequestParam String item_code) {
        return inventoryService.search(item_code);
    }


    @GetMapping("/all")
    public List<InventoryDTO> getAllInventories() {
        return inventoryService.getAll();
    }

    @GetMapping("/count")
    public String getInventoryCount() {
        return inventoryService.getInventoryCount();
    }

    @GetMapping("/sizeDetails")
    public List<SizeInventoryDetailsDTO> getSizeDetails(@RequestParam String item_code) {
        return inventoryService.getSizeDetails(item_code);
    }

}
