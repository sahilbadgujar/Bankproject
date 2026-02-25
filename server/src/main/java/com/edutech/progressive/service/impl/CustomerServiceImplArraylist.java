package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Customers;
@Service
public class CustomerServiceImplArraylist {

    private static List<Customers> customersList = new ArrayList<>();

    public List<Customers> getAllCustomers() throws SQLException {
        return customersList;
    }

    public int addCustomer(Customers customers) throws SQLException {
        customersList.add(customers);
        return customersList.size();
    }

    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        customersList.sort((a, b) ->
                a.getName().compareToIgnoreCase(b.getName()));
        return customersList;
    }

    public void emptyArrayList() {
        customersList.clear();
    }

    public Customers getCustomerById(int id){
        for(Customers c : customersList)
        {
            if(c.getCustomerId() == id)
                return c;
        }

        return null;
    }
}
