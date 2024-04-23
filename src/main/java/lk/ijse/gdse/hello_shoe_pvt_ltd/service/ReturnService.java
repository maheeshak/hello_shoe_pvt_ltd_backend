package lk.ijse.gdse.hello_shoe_pvt_ltd.service;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.ReturnDTO;

import java.util.List;

public interface ReturnService {
    boolean saveReturn(ReturnDTO returnDTO);
    public boolean deleteReturn(String id);
    public boolean updateReturn(ReturnDTO returnDTO);
    public List<ReturnDTO> getAllReturns();

    ReturnDTO getSelectedReturn(String id);
}
