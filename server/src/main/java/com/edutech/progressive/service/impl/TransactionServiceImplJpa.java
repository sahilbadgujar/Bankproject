// package com.edutech.progressive.service.impl;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.edutech.progressive.entity.Transactions;
// import com.edutech.progressive.repository.TransactionRepository;

// @Service
// public class TransactionServiceImplJpa {
//     // @Autowired
//     private TransactionRepository transactionRepo;

//     public TransactionServiceImplJpa(TransactionRepository transactionRepo) {
//         this.transactionRepo = transactionRepo;
//     }

//     public List<Transactions> getAllTransactions(){
//         return transactionRepo.findAll();
//     }
//     public Transactions getTransactionById(int transactionId){
//         return transactionRepo.findById(transactionId).orElse(null);

//     }

//     public int addTransaction(Transactions transactions){
//         return transactionRepo.save(transactions).getTransactionId();
//     }
    
//     public void updateTransaction(Transactions transactions){
//         transactionRepo.save(transactions);
//     }

//     public void deleteTransaction(int transactionId){
//         transactionRepo.deleteById(transactionId);
//     }
//     public List<Transactions> getTransactionsByCustomerId(int customerId){
//         // return transactionRepo.findByAccountCustomerCustomerId(customerId);
//         return null;
//     }
// }

package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Transactions;
import com.edutech.progressive.repository.TransactionRepository;
import com.edutech.progressive.service.TransactionService;

@Service
public class TransactionServiceImplJpa implements TransactionService {

    private  TransactionRepository transactionRepo;

    public TransactionServiceImplJpa() {
    }

    public TransactionServiceImplJpa(TransactionRepository transactionRepo) {
        this.transactionRepo = transactionRepo;
    }

    @Override
    public List<Transactions> getAllTransactions() throws SQLException {
        return transactionRepo.findAll();
    }

    @Override
    public Transactions getTransactionById(int transactionId) throws SQLException {
        return transactionRepo.findById(transactionId).orElse(null);
    }

    @Override
    public int addTransaction(Transactions transaction) throws SQLException {
        return transactionRepo.save(transaction).getTransactionId();
    }

    @Override
    public void updateTransaction(Transactions transaction) throws SQLException {
        transactionRepo.save(transaction);
    }

    @Override
    public void deleteTransaction(int transactionId) throws SQLException {
        transactionRepo.deleteById(transactionId);
    }

    @Override
    public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
        // return transactionRepo.findByAccountsCustomerCustomerId(customerId);
        return null;
    }
}

