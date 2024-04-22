package lk.ijse.gdse.hello_shoe_pvt_ltd.service;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.CustomerDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    boolean saveEmployee(EmployeeDTO employeeDTO);
    public boolean deleteEmployee(String id);
    public boolean updateEmployee(EmployeeDTO employeeDTO);
    public List<EmployeeDTO> getAllEmployees();

    EmployeeDTO getSelectedEmployee(String id);
}
