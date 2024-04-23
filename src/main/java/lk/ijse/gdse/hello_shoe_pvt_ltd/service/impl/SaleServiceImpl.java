package lk.ijse.gdse.hello_shoe_pvt_ltd.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.ReturnRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.SaleRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SaleDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.SaleEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.SaleService;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Converter;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SaleServiceImpl implements SaleService {
    private final SaleRepo saleRepo;
    private final Mapping mapping;
    private final Converter converter;
    @Override
    public boolean saveSale(SaleDTO saleDTO) {
        SaleEntity saleEntity = mapping.toSaleEntity(saleDTO);
        saleRepo.save(saleEntity);
        return true;

    }

    @Override
    public boolean deleteSale(String id) {
        return false;
    }

    @Override
    public boolean updateSale(SaleDTO saleDTO) {
        return false;
    }

    @Override
    public List<SaleDTO> getAllSales() {
        return null;
    }

    @Override
    public SaleDTO getSelectedSale(String id) {
        return null;
    }
}
