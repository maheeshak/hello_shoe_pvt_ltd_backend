package lk.ijse.gdse.hello_shoe_pvt_ltd.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.SizeRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SizeDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.InventoryEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.ReturnEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.SizeEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.SizeService;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Converter;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class SizeServiceImpl implements SizeService {
    private final SizeRepo sizeRepo;
    private final Mapping mapping;
    private final Converter converter;
    @Override
    public boolean saveSize(SizeDTO sizeDTO) {
        SizeEntity sizeEntity = mapping.toSizeEntity(sizeDTO);
        sizeRepo.save(sizeEntity);
        return true;
    }

    @Override
    public boolean deleteSize(String id) {
        Optional<SizeEntity> tmpSize = sizeRepo.findById(id);
        if (tmpSize.isPresent()) {
            sizeRepo.delete(tmpSize.get());
            return true;
        }
        return false;
    }

    @Override
    public boolean updateSize(SizeDTO sizeDTO) {
        Optional<SizeEntity> tmpSize = sizeRepo.findById(sizeDTO.getSize_code());
        if (tmpSize.isPresent()) {
            converter.convertSizeEntity(sizeDTO, tmpSize.get());
        }
        return true;
    }

    @Override
    public List<SizeDTO> getAllSizes() {
        return null;
    }

    @Override
    public SizeDTO getSelectedSize(String id) {
        return null;
    }
}
