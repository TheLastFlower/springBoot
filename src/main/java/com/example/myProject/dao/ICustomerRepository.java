package com.example.myProject.dao;

import com.example.myProject.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
    Customer findByUserName(String userName);
}
