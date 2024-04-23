package lk.ijse.gdse.hello_shoe_pvt_ltd.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.EmployeeRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.InventoryRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.InventoryDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.InventoryEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.InventoryService;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Converter;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {
    private final InventoryRepo inventoryRepo;
    private final Mapping mapping;
    private final Converter converter;
    @Override
    public boolean saveInventory(InventoryDTO inventoryDTO) {
        InventoryEntity inventoryEntity = mapping.toInventoryEntity(inventoryDTO);
        inventoryRepo.save(inventoryEntity);
        return true;
    }

    @Override
    public boolean deleteInventory(String id) {
        Optional<InventoryEntity> tmpInventory = inventoryRepo.findById(id);
        if (tmpInventory.isPresent()) {
            inventoryRepo.delete(tmpInventory.get());
            return true;
        }
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
