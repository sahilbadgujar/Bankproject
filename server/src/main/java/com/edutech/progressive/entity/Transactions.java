// package com.edutech.progressive.entity;

// // import jakarta.persistence.*;
// import java.util.Date;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;
// import javax.persistence.Table;
// import javax.persistence.Temporal;
// import javax.persistence.TemporalType;

// @Entity
// @Table(name = "transactions")
// public class Transactions {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int transactionId;

//     private double amount;

//     private String transactionType;

//     @Temporal(TemporalType.TIMESTAMP)
//     private Date transactionDate;

//     // 🔥 REQUIRED FOR DAY 6
//     @ManyToOne
//     @JoinColumn(name = "account_id")
//     private Accounts accounts;

//     public Transactions() {}

//     public Transactions(int transactionId, Accounts accounts, double amount,
//                         Date transactionDate, String transactionType) {
//         this.transactionId = transactionId;
//         this.accounts = accounts;
//         this.amount = amount;
//         this.transactionDate = transactionDate;
//         this.transactionType = transactionType;
//     }

//     // getters & setters
//     public int getTransactionId() { return transactionId; }
//     public void setTransactionId(int transactionId) { this.transactionId = transactionId; }

//     public double getAmount() { return amount; }
//     public void setAmount(double amount) { this.amount = amount; }

//     public String getTransactionType() { return transactionType; }
//     public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

//     public Date getTransactionDate() { return transactionDate; }
//     public void setTransactionDate(Date transactionDate) { this.transactionDate = transactionDate; }

//     public Accounts getAccounts() { return accounts; }
//     public void setAccounts(Accounts accounts) { this.accounts = accounts; }
// }


package com.edutech.progressive.entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Transactions {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  
  private int transactionId;
  private int accountId;
  private double amount;
  private Date transactionDate;
  private String transactionType;
  

  public Transactions(){
    
  }
  
 
  public Transactions(int transactionId, int accountId, double amount, Date transactionDate, String transactionType) {
    this.transactionId = transactionId;
    this.accountId = accountId;
    this.amount = amount;
    this.transactionDate = transactionDate;
    this.transactionType = transactionType;
  }


  public int getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(int transactionId) {
    this.transactionId = transactionId;
  }
  public int getAccountId() {
    return accountId;
  }
  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }
  public double getAmount() {
    return amount;
  }
  public void setAmount(double amount) {
    this.amount = amount;
  }
  public String getTransactionType() {
    return transactionType;
  }
  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }
  public Date getTransactionDate() {
    return transactionDate;
  }
  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }

}
