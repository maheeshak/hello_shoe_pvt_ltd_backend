package lk.ijse.gdse.hello_shoe_pvt_ltd.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.SupplierRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SupplierDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.CustomerEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.SupplierEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.SupplierService;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Converter;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Mapping;
import lombok.RequiredArgsConstructor;


import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService {
    private final SupplierRepo supplierRepo;
    private final Mapping mapping;
    private final Converter converter;
    @Override
    public boolean saveSupplier(SupplierDTO supplierDTO) {
        SupplierEntity supplierEntity = mapping.toSupplierEntity(supplierDTO);
        supplierRepo.save(supplierEntity);
        return true;
    }

    @Override
    public boolean deleteSupplier(String id) {
        Optional<SupplierEntity> tmpSupplier = supplierRepo.findById(id);
        if (tmpSupplier.isPresent()) {
            supplierRepo.delete(tmpSupplier.get());
            return true;
        }

        return false;
    }

    @Override
    public boolean updateSupplier(SupplierDTO supplierDTO) {
        Optional<SupplierEntity> tmpSupplier = supplierRepo.findById(supplierDTO.getSupplier_code());
        if (tmpSupplier.isPresent()) {
            converter.convertSupplierEntity(supplierDTO, tmpSupplier.get());
        }

        return true;
    }

    @Override
    public List<SupplierDTO> getAllSuppliers() {
        return null;
    }

    @Override
    public SupplierDTO getSelectedSupplier(String id) {
        return null;
    }
}
