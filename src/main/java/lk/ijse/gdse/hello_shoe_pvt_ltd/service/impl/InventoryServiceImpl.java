package lk.ijse.gdse.hello_shoe_pvt_ltd.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.EmployeeRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.InventoryRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.SizeInventoryDetailsRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.InventoryDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.extra.InventoryDetailsDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.InventoryEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.SizeInventoryDetailsEntity;
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

    private final SizeInventoryDetailsRepo sizeInventoryDetailsRepo;

    @Override
    public boolean saveInventory(InventoryDTO inventoryDTO) {
        return false;
    }

    public boolean add(InventoryDetailsDTO inventoryDetailsDTO) {

        if (inventoryRepo.existsById(inventoryDetailsDTO.getInventoryDTO().getItem_code())) {
            return false;
        }

        InventoryEntity inventoryEntity = mapping.toInventoryEntity(inventoryDetailsDTO.getInventoryDTO());
        List<SizeInventoryDetailsEntity> sizeInventoryDetailsEntities = mapping.mapToSizeInventoryDetailsEntity(inventoryDetailsDTO.getSizeInventoryDetailsDTO());

        inventoryRepo.save(inventoryEntity);
        sizeInventoryDetailsRepo.saveAll(sizeInventoryDetailsEntities);

        if (inventoryRepo.existsById(inventoryEntity.getItem_code())) {
            return true;
        } else {
            return false;
        }


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
        Optional<InventoryEntity> tmpInventory = inventoryRepo.findById(inventoryDTO.getItem_code());
        if (tmpInventory.isPresent()) {
            converter.convertInventoryEntity(inventoryDTO, tmpInventory.get());
        }
        return true;
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
