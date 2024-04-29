package lk.ijse.gdse.hello_shoe_pvt_ltd.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.ReturnRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.SaleInventoryDetailsRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.SaleRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SaleDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.extra.SaleDetailDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.ReturnEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.SaleEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.SaleInventoryDetailsEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.SaleService;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Converter;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class SaleServiceImpl implements SaleService {
    private final SaleRepo saleRepo;
private final SaleInventoryDetailsRepo saleInventoryDetailsRepo;
    private final Mapping mapping;
    private final Converter converter;
    @Override
    public boolean saveSale(SaleDetailDTO saleDetailDTO) {
        SaleEntity saleEntity = mapping.toSaleEntity(saleDetailDTO.getSaleDTO());
       List<SaleInventoryDetailsEntity> saleInventoryDetailsEntities= mapping.mapToSaleDetailsDTO(saleDetailDTO);
       saleRepo.save(saleEntity);
       saleInventoryDetailsRepo.saveAll(saleInventoryDetailsEntities);

       if(saleRepo.existsById(saleEntity.getOrder_id())){
           return true;
       }
         return false;



    }

    @Override
    public boolean deleteSale(String id) {
        Optional<SaleEntity> tmpSale = saleRepo.findById(id);
        if (tmpSale.isPresent()) {
            saleRepo.delete(tmpSale.get());
            return true;
        }
        return false;
    }

    @Override
    public boolean updateSale(SaleDTO saleDTO) {
        Optional<SaleEntity> tmpSale = saleRepo.findById(saleDTO.getOrder_id());
        if (tmpSale.isPresent()) {
            converter.convertSaleEntity(saleDTO, tmpSale.get());
        }
        return true;
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
