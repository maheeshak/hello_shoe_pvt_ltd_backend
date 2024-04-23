package lk.ijse.gdse.hello_shoe_pvt_ltd.service;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.InventoryDTO;

import java.util.List;

public interface InventoryService {
    public boolean saveInventory(InventoryDTO inventoryDTO);
    public boolean deleteInventory(String id);
    public boolean updateInventory(InventoryDTO inventoryDTO);
    public List<InventoryDTO> getAllInventories();

    InventoryDTO getSelectedInventory(String id);
}
