// package com.edutech.progressive.entity;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;
// import javax.persistence.Table;

// // import jakarta.persistence.*;

// @Entity
// @Table(name = "accounts")
// public class Accounts implements Comparable<Accounts> {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int accountId;

//     private double balance;

    
//     @ManyToOne
//     @JoinColumn(name = "customer_id")
//     private Customers customer;

//     public Accounts() {}

//     public Accounts(int accountId, Customers customer, double balance) {
//         this.accountId = accountId;
//         this.customer = customer;
//         this.balance = balance;
//     }

//     // getters & setters
//     public int getAccountId() { return accountId; }
//     public void setAccountId(int accountId) { this.accountId = accountId; }

//     public double getBalance() { return balance; }
//     public void setBalance(double balance) { this.balance = balance; }

//     public Customers getCustomer() { return customer; }
//     public void setCustomer(Customers customer) { this.customer = customer; }

//     @Override
//     public int compareTo(Accounts o) {
//         return Double.compare(this.balance, o.balance);
//     }
// }

package com.edutech.progressive.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Accounts implements Comparable<Accounts> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    private Integer customerId;

    private double balance;

    public Accounts() {
    }

    public Accounts(Integer accountId, Integer customerId, double balance) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.balance = balance;
    }

    public Integer getAccountId() {
        return accountId;
    }
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(Accounts o) {
        return Double.compare(this.balance, o.balance);
    }
}