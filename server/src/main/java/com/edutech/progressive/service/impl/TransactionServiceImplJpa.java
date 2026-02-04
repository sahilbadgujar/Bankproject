package com.edutech.progressive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Transactions;
import com.edutech.progressive.repository.TransactionRepository;

@Service
public class TransactionServiceImplJpa {
    // @Autowired
    private TransactionRepository transactionRepo;

    public TransactionServiceImplJpa(TransactionRepository transactionRepo) {
        this.transactionRepo = transactionRepo;
    }

    public List<Transactions> getAllTransactions(){
        return transactionRepo.findAll();
    }
    public Transactions getTransactionById(int transactionId){
        return transactionRepo.findById(transactionId).orElse(null);

    }

    public int addTransaction(Transactions transactions){
        return transactionRepo.save(transactions).getTransactionId();
    }
    
    public void updateTransaction(Transactions transactions){
        transactionRepo.save(transactions);
    }

    public void deleteTransaction(int transactionId){
        transactionRepo.deleteById(transactionId);
    }
    public List<Transactions> getTransactionsByCustomerId(int customerId){
        // return transactionRepo.findByAccountCustomerCustomerId(customerId);
        return null;
    }

}
