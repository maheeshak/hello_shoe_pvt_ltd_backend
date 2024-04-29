package lk.ijse.gdse.hello_shoe_pvt_ltd.util;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.*;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.extra.SaleDetailDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Mapping {

    private final ModelMapper mapper;

    //Customer Mapping.....

    //Entity convert to DTO
    public CustomerDTO toCustomerDTO(CustomerEntity customer) {
        return mapper.map(customer, CustomerDTO.class);
    }

    //DTO convert to Entity
    public CustomerEntity toCustomerEntity(CustomerDTO customerDTO) {
        return mapper.map(customerDTO, CustomerEntity.class);
    }

    //List of Entity convert to List of DTO
    public List<CustomerDTO> toCustomerDTOList(List<CustomerEntity> customers) {
        return customers.stream().map(customer -> mapper.map(customer, CustomerDTO.class)).collect(Collectors.toList());
    }


    //Supplier Mapping.....
    public SupplierDTO toSupplierDTO(SupplierEntity supplier) {
        return mapper.map(supplier, SupplierDTO.class);
    }

    public SupplierEntity toSupplierEntity(SupplierDTO supplierDTO) {
        return mapper.map(supplierDTO, SupplierEntity.class);
    }

    public List<SupplierDTO> toSupplierDTOList(List<SupplierEntity> suppliers) {
        return suppliers.stream().map(supplier -> mapper.map(supplier, SupplierDTO.class)).collect(Collectors.toList());
    }

    //Employee Mapping.....
    public EmployeeDTO toEmployeeDTO(EmployeeEntity employee) {
        return mapper.map(employee, EmployeeDTO.class);
    }

    public EmployeeEntity toEmployeeEntity(EmployeeDTO employeeDTO) {
        return mapper.map(employeeDTO, EmployeeEntity.class);
    }

    public List<EmployeeDTO> toEmployeeDTOList(List<EmployeeEntity> employees) {
        return employees.stream().map(employee -> mapper.map(employee, EmployeeDTO.class)).collect(Collectors.toList());
    }

    //Inventory Mapping.....
    public InventoryDTO toInventoryDTO(InventoryEntity inventory) {
        return mapper.map(inventory, InventoryDTO.class);
    }

    public InventoryEntity toInventoryEntity(InventoryDTO inventoryDTO) {
        return mapper.map(inventoryDTO, InventoryEntity.class);
    }

    public List<InventoryDTO> toInventoryDTOList(List<InventoryEntity> inventories) {
        return inventories.stream().map(inventory -> mapper.map(inventory, InventoryDTO.class)).collect(Collectors.toList());
    }


    //Return mapping
    public ReturnDTO toReturnDTO(ReturnEntity returnEntity) {
        return mapper.map(returnEntity, ReturnDTO.class);
    }

    public ReturnEntity toReturnEntity(ReturnDTO returnDTO) {
        return mapper.map(returnDTO, ReturnEntity.class);
    }

    public List<ReturnDTO> toReturnDTOList(List<ReturnEntity> returnEntities) {
        return returnEntities.stream().map(returnEntity -> mapper.map(returnEntity, ReturnDTO.class)).collect(Collectors.toList());
    }

    //Sale Mapping

    public SaleDTO toSaleDTO(SaleEntity saleEntity) {
        return mapper.map(saleEntity, SaleDTO.class);
    }

    public SaleEntity toSaleEntity(SaleDTO saleDTO) {
        return mapper.map(saleDTO, SaleEntity.class);
    }

    public List<SaleDTO> toSaleDTOList(List<SaleEntity> saleEntities) {

        return saleEntities.stream().map(saleEntity -> mapper.map(saleEntity, SaleDTO.class)).collect(Collectors.toList());
    }


    //Size Mapping
    public SizeDTO toSizeDTO(SizeEntity sizeEntity) {
        return mapper.map(sizeEntity, SizeDTO.class);
    }

    public SizeEntity toSizeEntity(SizeDTO sizeDTO) {
        return mapper.map(sizeDTO, SizeEntity.class);
    }

    public List<SizeDTO> toSizeDTOList(List<SizeEntity> sizeEntities) {
        return sizeEntities.stream().map(sizeEntity -> mapper.map(sizeEntity, SizeDTO.class)).collect(Collectors.toList());
    }

    //SaleInventoryDetails Mapping
    public List<SaleInventoryDetailsEntity> mapToSaleDetailsDTO(SaleDetailDTO saleDetailDTO) {
        List<SaleInventoryDetailsEntity> saleInventoryDetailsEntities = new ArrayList<>();

        for (SaleInventoryDetailsDTO saleInventoryDetailsDTO : saleDetailDTO.getSaleInventoryDetailsDTOS()) {
            SaleInventoryDetailsEntity saleInventoryDetailsEntity = new SaleInventoryDetailsEntity();
            saleInventoryDetailsEntity.setId(saleInventoryDetailsDTO.getId());
            saleInventoryDetailsEntity.setSaleEntity(toSaleEntity(saleDetailDTO.getSaleDTO()));
            saleInventoryDetailsEntity.setInventoryEntity(toInventoryEntity(saleInventoryDetailsDTO.getInventoryDTO()));
            saleInventoryDetailsEntity.setSize(saleInventoryDetailsDTO.getSize());
            saleInventoryDetailsEntity.setItem_qty(saleInventoryDetailsDTO.getItem_qty());
            saleInventoryDetailsEntity.setSelling_price(saleInventoryDetailsDTO.getSelling_price());
            saleInventoryDetailsEntities.add(saleInventoryDetailsEntity);

        }
        return saleInventoryDetailsEntities;

    }
}
