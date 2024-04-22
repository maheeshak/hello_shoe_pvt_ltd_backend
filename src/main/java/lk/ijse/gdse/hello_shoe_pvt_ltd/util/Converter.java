package lk.ijse.gdse.hello_shoe_pvt_ltd.util;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.CustomerDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.EmployeeDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SupplierDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.CustomerEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.EmployeeEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.SupplierEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Converter {

    public void covertCustomerEntity(CustomerDTO customerDTO,CustomerEntity customerEntity){

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

    public void convertSupplierEntity(SupplierDTO supplierDTO, SupplierEntity supplierEntity){
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
        employeeEntity.setBranch(employeeDTO.getBranch());
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

}
