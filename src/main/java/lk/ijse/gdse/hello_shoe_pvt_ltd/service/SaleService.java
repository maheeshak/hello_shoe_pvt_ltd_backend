package lk.ijse.gdse.hello_shoe_pvt_ltd.service;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.InventoryDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SaleDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.extra.SaleDetailDTO;

import java.util.ArrayList;
import java.util.List;

public interface SaleService {
    public boolean saveSale(SaleDetailDTO saleDetailDTO);
    public boolean deleteSale(String id);
    public boolean updateSale(SaleDTO saleDTO);
    public List<SaleDTO> getAllSales();

    SaleDTO getSelectedSale(String id);
}
