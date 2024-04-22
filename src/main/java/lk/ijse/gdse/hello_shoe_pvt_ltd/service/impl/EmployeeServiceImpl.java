package lk.ijse.gdse.hello_shoe_pvt_ltd.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.CustomerRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.EmployeeRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.EmployeeDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.CustomerEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.EmployeeEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.EmployeeService;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Converter;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final Mapping mapping;
    private final Converter converter;
    @Override
    public boolean saveEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = mapping.toEmployeeEntity(employeeDTO);
        employeeRepo.save(employeeEntity);
        return true;
    }

    @Override
    public boolean deleteEmployee(String id) {
        Optional<EmployeeEntity> tmpEmployee = employeeRepo.findById(id);
        if (tmpEmployee.isPresent()) {
            employeeRepo.delete(tmpEmployee.get());
            return true;
        }

        return false;
    }

    @Override
    public boolean updateEmployee(EmployeeDTO employeeDTO) {
        Optional<EmployeeEntity> tmpEmployee = employeeRepo.findById(employeeDTO.getEmployee_code());
        if (tmpEmployee.isPresent()) {
            converter.convertEmployeeEntity(employeeDTO, tmpEmployee.get());
        }

        return true;
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return null;
    }

    @Override
    public EmployeeDTO getSelectedEmployee(String id) {
        return null;
    }
}
