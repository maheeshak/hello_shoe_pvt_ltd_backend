package lk.ijse.gdse.hello_shoe_pvt_ltd.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.CustomerRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.CustomerDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.CustomerEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.CustomerService;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Converter;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Mapping;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;
    private final Mapping mapping;
    private final Converter converter;


    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) {

        CustomerEntity customerEntity = mapping.toCustomerEntity(customerDTO);
        customerRepo.save(customerEntity);
        return true;

    }

    @Override
    public boolean deleteCustomer(String id) {
        Optional<CustomerEntity> tmpCustomer = customerRepo.findById(id);
        if (tmpCustomer.isPresent()) {
            customerRepo.delete(tmpCustomer.get());
            return true;
        }

        return false;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) {

        Optional<CustomerEntity> tmpCustomer = customerRepo.findById(customerDTO.getCustomer_code());
        if (tmpCustomer.isPresent()) {
            converter.covertCustomerEntity(customerDTO, tmpCustomer.get());
        }

        return true;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return null;
    }

    @Override
    public CustomerDTO getSelectedCustomer(String id) {
        return null;
    }
}
