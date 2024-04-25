package lk.ijse.gdse.hello_shoe_pvt_ltd.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.SizeRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SizeDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.SizeEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.SizeService;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Converter;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return false;
    }

    @Override
    public boolean updateSize(SizeDTO sizeDTO) {
        return false;
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
