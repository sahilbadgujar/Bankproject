// package com.edutech.progressive.service.impl;

// import java.sql.SQLException;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.edutech.progressive.dao.AccountDAO;
// import com.edutech.progressive.entity.Accounts;
// import com.edutech.progressive.repository.AccountRepository;
// @Service
// public class AccountServiceImplJpa {
//     // @Autowired
//     private AccountRepository accRepo;

//     public AccountServiceImplJpa(AccountRepository accRepo) {
//         this.accRepo = accRepo;
//     }

//     public List<Accounts> getAllAccounts(){
//         return accRepo.findAll();
//     }

//     public int addAccount(Accounts accounts){
//         return accRepo.save(accounts).getAccountId();
//     }

//     public void updateAccount(Accounts accounts){
//         accRepo.save(accounts);
//     }

//     public void deleteAccount(int accountId){
//         accRepo.deleteById(accountId);
//     }

//     public List<Accounts> getAllAccountsSortedByBalance(){
//         List<Accounts> list = accRepo.findAll();
//         list.sort(Accounts::compareTo);
//         return list;
//     }

   

    
// }

package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Customers;
import com.edutech.progressive.repository.CustomerRepository;
import com.edutech.progressive.service.CustomerService;

@Service
public class CustomerServiceImplJpa implements CustomerService {

    private final CustomerRepository custRepo;

    public CustomerServiceImplJpa(CustomerRepository custRepo) {
        this.custRepo = custRepo;
    }

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        return custRepo.findAll();
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        return custRepo.findByCustomerId(customerId);
    }

    @Override
    public int addCustomer(Customers customers) throws SQLException {
        return custRepo.save(customers).getCustomerId();
    }

    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        custRepo.save(customers);
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
        custRepo.deleteByCustomerId(customerId);
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        List<Customers> list = custRepo.findAll();
        list.sort(Customers::compareTo);
        return list;
    }
}

