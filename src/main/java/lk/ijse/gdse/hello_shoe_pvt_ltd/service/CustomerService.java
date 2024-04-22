package lk.ijse.gdse.hello_shoe_pvt_ltd.service;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    boolean saveCustomer(CustomerDTO customerDTO);
    public boolean deleteCustomer(String id);
    public boolean updateCustomer(CustomerDTO customerDTO);
    public List<CustomerDTO> getAllCustomers();

    CustomerDTO getSelectedCustomer(String id);
}
