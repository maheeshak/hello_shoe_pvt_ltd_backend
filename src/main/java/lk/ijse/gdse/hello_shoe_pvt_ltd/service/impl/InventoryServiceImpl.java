package lk.ijse.gdse.hello_shoe_pvt_ltd.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.InventoryDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    @Override
    public boolean saveInventory(InventoryDTO inventoryDTO) {
        return false;
    }

    @Override
    public boolean deleteInventory(String id) {
        return false;
    }

    @Override
    public boolean updateInventory(InventoryDTO inventoryDTO) {
        return false;
    }

    @Override
    public List<InventoryDTO> getAllInventories() {
        return null;
    }

    @Override
    public InventoryDTO getSelectedInventory(String id) {
        return null;
    }
}
