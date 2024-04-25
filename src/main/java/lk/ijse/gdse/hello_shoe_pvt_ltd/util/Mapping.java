package lk.ijse.gdse.hello_shoe_pvt_ltd.util;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.*;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.*;
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


    //Return mapping
    public ReturnDTO toReturnDTO(ReturnEntity returnEntity){
        return mapper.map(returnEntity, ReturnDTO.class);
    }

    public ReturnEntity toReturnEntity(ReturnDTO returnDTO){
        return mapper.map(returnDTO, ReturnEntity.class);
    }

    public List<ReturnDTO> toReturnDTOList(List<ReturnEntity> returnEntities){
        return mapper.map(returnEntities, List.class);
    }

    //Sale Mapping

    public SaleDTO toSaleDTO(SaleEntity saleEntity){
        return mapper.map(saleEntity, SaleDTO.class);
    }

    public SaleEntity toSaleEntity(SaleDTO saleDTO){
        return mapper.map(saleDTO, SaleEntity.class);
    }

    public List<SaleDTO> toSaleDTOList(List<SaleEntity> saleEntities){
        return mapper.map(saleEntities, List.class);
    }


    //Size Mapping
    public SizeDTO toSizeDTO(SizeEntity sizeEntity){
        return mapper.map(sizeEntity, SizeDTO.class);
    }

    public SizeEntity toSizeEntity(SizeDTO sizeDTO){
        return mapper.map(sizeDTO, SizeEntity.class);
    }

    public List<SizeDTO> toSizeDTOList(List<SizeEntity> sizeEntities){
        return mapper.map(sizeEntities, List.class);
    }
}
