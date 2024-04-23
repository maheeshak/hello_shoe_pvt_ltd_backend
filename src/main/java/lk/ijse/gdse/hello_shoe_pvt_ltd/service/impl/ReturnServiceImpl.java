package lk.ijse.gdse.hello_shoe_pvt_ltd.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.InventoryRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.ReturnRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.ReturnDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.InventoryEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.ReturnEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.ReturnService;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Converter;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ReturnServiceImpl implements ReturnService {
    private final ReturnRepo returnRepo;
    private final Mapping mapping;
    private final Converter converter;

    @Override
    public boolean saveReturn(ReturnDTO returnDTO) {
        ReturnEntity returnEntity = mapping.toReturnEntity(returnDTO);
        returnRepo.save(returnEntity);
        return true;
    }

    @Override
    public boolean deleteReturn(String id) {

        Optional<ReturnEntity> tmpReturn = returnRepo.findById(id);
        if (tmpReturn.isPresent()) {
            returnRepo.delete(tmpReturn.get());
            return true;
        }
        return false;
    }

    @Override
    public boolean updateReturn(ReturnDTO returnDTO) {
        Optional<ReturnEntity> tmpReturn = returnRepo.findById(returnDTO.getReturn_id());
        if (tmpReturn.isPresent()) {
            converter.convertReturnEntity(returnDTO, tmpReturn.get());
        }
        return true;

    }

    @Override
    public List<ReturnDTO> getAllReturns() {
        return null;
    }

    @Override
    public ReturnDTO getSelectedReturn(String id) {
        return null;
    }
}
