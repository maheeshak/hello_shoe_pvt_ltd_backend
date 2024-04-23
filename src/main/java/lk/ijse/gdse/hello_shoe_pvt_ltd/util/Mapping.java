package lk.ijse.gdse.hello_shoe_pvt_ltd.util;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.CustomerDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.EmployeeDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.InventoryDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SupplierDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.CustomerEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.EmployeeEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.InventoryEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.SupplierEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Mapping {

    private final ModelMapper mapper;

    //Customer Mapping.....

    //Entity convert to DTO
    public CustomerDTO toCustomerDTO(CustomerEntity customer){
        return mapper.map(customer, CustomerDTO.class);
    }
    //DTO convert to Entity
    public CustomerEntity toCustomerEntity(CustomerDTO customerDTO){
        return mapper.map(customerDTO, CustomerEntity.class);
    }
    //List of Entity convert to List of DTO
    public List<CustomerDTO> toCustomerDTOList(List<CustomerEntity> customers){
        return mapper.map(customers, List.class);
    }


    //Supplier Mapping.....
    public SupplierDTO toSupplierDTO(SupplierEntity supplier){
        return mapper.map(supplier, SupplierDTO.class);
    }

    public SupplierEntity toSupplierEntity(SupplierDTO supplierDTO){
        return mapper.map(supplierDTO, SupplierEntity.class);
    }

    public List<SupplierDTO> toSupplierDTOList(List<SupplierEntity> suppliers){
        return mapper.map(suppliers, List.class);
    }

    //Employee Mapping.....
    public EmployeeDTO toEmployeeDTO(EmployeeEntity employee){
        return mapper.map(employee, EmployeeDTO.class);
    }

    public EmployeeEntity toEmployeeEntity(EmployeeDTO employeeDTO){
        return mapper.map(employeeDTO, EmployeeEntity.class);
    }

    public List<EmployeeDTO> toEmployeeDTOList(List<EmployeeEntity> employees){
        return mapper.map(employees, List.class);
    }

    //Inventory Mapping.....
    public InventoryDTO toInventoryDTO(InventoryEntity inventory){
        return mapper.map(inventory, InventoryDTO.class);
    }

    public InventoryEntity toInventoryEntity(InventoryDTO inventoryDTO){
        return mapper.map(inventoryDTO, InventoryEntity.class);
    }

    public List<InventoryDTO> toInventoryDTOList(List<InventoryEntity> inventories){
        return mapper.map(inventories, List.class);
    }
}
