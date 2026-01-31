package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.edutech.progressive.entity.Customers;
import com.edutech.progressive.service.CustomerService;

public class CustomerServiceImplArraylist implements CustomerService  {

    List<Customers> customersList = new ArrayList<>();

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        // get all customers
        return customersList;
    }

    @Override
    public int addCustomer(Customers customers) throws SQLException {
        // adding customer
        customersList.add(customers);
        return customersList.size();
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        // implementing comparable
        Collections.sort(customersList);
        return customersList;

    }
    @Override
     public void emptyArrayList() {
        customersList.clear();

     }

}