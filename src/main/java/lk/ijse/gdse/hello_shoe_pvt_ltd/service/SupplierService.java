package lk.ijse.gdse.hello_shoe_pvt_ltd.service;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.CustomerDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SupplierDTO;

import java.util.List;

public interface SupplierService {
    boolean saveSupplier(SupplierDTO supplierDTO);
    public boolean deleteSupplier(String id);
    public boolean updateSupplier(SupplierDTO supplierDTO);
    public List<SupplierDTO> getAllSuppliers();

    SupplierDTO getSelectedSupplier(String id);
}
