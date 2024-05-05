package lk.ijse.gdse.hello_shoe_pvt_ltd.util;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.*;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Converter {
    private final Mapping mapper;

    public void covertCustomerEntity(CustomerDTO customerDTO, CustomerEntity customerEntity) {

        customerEntity.setCustomer_code(customerDTO.getCustomer_code());
        customerEntity.setCustomer_name(customerDTO.getCustomer_name());
        customerEntity.setGender(customerDTO.getGender());
        customerEntity.setJoined_date(customerDTO.getJoined_date());
        customerEntity.setLevel(customerDTO.getLevel());
        customerEntity.setTotal_points(customerDTO.getTotal_points());
        customerEntity.setDob(customerDTO.getDob());
        customerEntity.setBuilding_no(customerDTO.getBuilding_no());
        customerEntity.setLane(customerDTO.getLane());
        customerEntity.setCity(customerDTO.getCity());
        customerEntity.setState(customerDTO.getState());
        customerEntity.setPostal_code(customerDTO.getPostal_code());
        customerEntity.setContact(customerDTO.getContact());
        customerEntity.setEmail(customerDTO.getEmail());
        customerEntity.setRecent_purchase(customerDTO.getRecent_purchase());

    }

    public void convertSupplierEntity(SupplierDTO supplierDTO, SupplierEntity supplierEntity) {
        supplierEntity.setSupplier_code(supplierDTO.getSupplier_code());
        supplierEntity.setSupplier_name(supplierDTO.getSupplier_name());
        supplierEntity.setCategory(supplierDTO.getCategory());
        supplierEntity.setBuilding_no(supplierDTO.getBuilding_no());
        supplierEntity.setLane(supplierDTO.getLane());
        supplierEntity.setCity(supplierDTO.getCity());
        supplierEntity.setState(supplierDTO.getState());
        supplierEntity.setPostal_code(supplierDTO.getPostal_code());
        supplierEntity.setCountry(supplierDTO.getCountry());
        supplierEntity.setContact_01(supplierDTO.getContact_01());
        supplierEntity.setContact_02(supplierDTO.getContact_02());
        supplierEntity.setEmail(supplierDTO.getEmail());

    }

    public void convertEmployeeEntity(EmployeeDTO employeeDTO, EmployeeEntity employeeEntity) {
        employeeEntity.setEmployee_code(employeeDTO.getEmployee_code());
        employeeEntity.setEmployee_name(employeeDTO.getEmployee_name());
        employeeEntity.setProfile_pic(employeeDTO.getProfile_pic());
        employeeEntity.setGender(employeeDTO.getGender());
        employeeEntity.setStatus(employeeDTO.getStatus());
        employeeEntity.setDesignation(employeeDTO.getDesignation());
        employeeEntity.setRole(employeeDTO.getRole());
        employeeEntity.setDob(employeeDTO.getDob());
        employeeEntity.setJoined_date(employeeDTO.getJoined_date());
        employeeEntity.setBranch(mapper.toBranchEntity(employeeDTO.getBranch()));
        employeeEntity.setBuilding_no(employeeDTO.getBuilding_no());
        employeeEntity.setLane(employeeDTO.getLane());
        employeeEntity.setCity(employeeDTO.getCity());
        employeeEntity.setState(employeeDTO.getState());
        employeeEntity.setPostal_code(employeeDTO.getPostal_code());
        employeeEntity.setContact(employeeDTO.getContact());
        employeeEntity.setEmail(employeeDTO.getEmail());
        employeeEntity.setGuardian_name(employeeDTO.getGuardian_name());
        employeeEntity.setEmergency_contact(employeeDTO.getEmergency_contact());


    }

    public void convertInventoryEntity(InventoryDTO inventoryDTO, InventoryEntity inventoryEntity) {
      inventoryEntity.setSupplierEntity(mapper.toSupplierEntity(inventoryDTO.getSupplierDTO()));
        inventoryEntity.setItem_code(inventoryDTO.getItem_code());
        inventoryEntity.setItem_desc(inventoryDTO.getItem_desc());
        inventoryEntity.setItem_pic(inventoryDTO.getItem_pic());
        inventoryEntity.setGender(inventoryDTO.getGender());
        inventoryEntity.setOccasion(inventoryDTO.getOccasion());
        inventoryEntity.setVariety(inventoryDTO.getVariety());




    }

    public void convertReturnEntity(ReturnDTO returnDTO, ReturnEntity returnEntity) {
        returnEntity.setReturn_id(returnDTO.getReturn_id());
        returnEntity.setOrder_id(returnDTO.getOrder_id());
        returnEntity.setReturn_date(returnDTO.getReturn_date());
      returnEntity.setReason(returnDTO.getReason());
        returnEntity.setItem_code(returnDTO.getItem_code());
        returnEntity.setSize(returnDTO.getSize_code());
        returnEntity.setQty(returnDTO.getQty());
    }

    public void convertSaleEntity(SaleDTO saleDTO, SaleEntity saleEntity) {
        saleEntity.setCustomerEntity(mapper.toCustomerEntity(saleDTO.getCustomer()));
        saleEntity.setOrder_id(saleDTO.getOrder_id());
        saleEntity.setTotal_price(saleDTO.getTotal_price());
        saleEntity.setPurchase_date(saleDTO.getPurchase_date());
        saleEntity.setPayment_method(saleDTO.getPayment_method());
        saleEntity.setAdded_points(saleDTO.getAdded_points());
        saleEntity.setCashier_name(saleDTO.getCashier_name());
    }

    public void convertSizeEntity(SizeDTO sizeDTO, SizeEntity sizeEntity) {
        sizeEntity.setSize_code(sizeDTO.getSize_code());
        sizeEntity.setSize(sizeDTO.getSize());
        sizeEntity.setCategory(sizeDTO.getCategory());
    }


   public void convertBranchEntity(BranchDTO branchDTO, BranchEntity branchEntity){
        branchEntity.setBranch_code(branchDTO.getBranch_code());
        branchEntity.setBranch_name(branchDTO.getBranch_name());
        branchEntity.setBranch_manager(branchDTO.getBranch_manager());
        branchEntity.setNo_of_employees(branchDTO.getNo_of_employees());
        branchEntity.setContact(branchDTO.getContact());
        branchEntity.setAddress(branchDTO.getAddress());
        branchEntity.setEmployees(mapper.toEmployeeEntityList(branchDTO.getEmployees()));
    }

    public void convertUserEntity(UserDTO userDTO, UserEntity userEntity){
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setRole(userDTO.getRole());
    }


}
