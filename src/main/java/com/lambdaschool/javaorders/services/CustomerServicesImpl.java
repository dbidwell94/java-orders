package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Customer;
import com.lambdaschool.javaorders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServicesImpl implements CustomerServices {
    @Autowired
    private CustomersRepository customerRepos;

    @Override
    public Customer save(Customer customer) {
        return customerRepos.save(customer);
    }
}
