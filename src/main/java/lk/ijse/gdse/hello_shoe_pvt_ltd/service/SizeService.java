package lk.ijse.gdse.hello_shoe_pvt_ltd.service;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.CustomerDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SizeDTO;

import java.util.List;

public interface SizeService {
    boolean saveSize(SizeDTO sizeDTO);
    public boolean deleteSize(String id);
    public boolean updateSize(SizeDTO sizeDTO);
    public List<SizeDTO> getAllSizes();

    SizeDTO getSelectedSize(String id);
}
