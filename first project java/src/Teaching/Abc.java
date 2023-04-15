package Teaching;

import java.util.*;
import java.time.*;
import java.util.regex.Pattern;

public class Abc {
    public static void main(String[] args) {
       String p = "";
        for (int i = 0; i < 100; i++) {
            p+= "@puju ";
        }
        System.out.println(p);
    }
}

// data class : classes who's objects store data.
// Human

// action classes : Account Service

class AccountService {
    static Account account;
    private static AccountService accountService;

    private AccountService(Account account) {
        this.account = account;
    }
    private AccountService() {
        this.account = account;
    }
    //static factory methods.
    //static , factory -> returns object of the class it is in.
    public static AccountService createAccountService() {
        if(accountService == null){
            accountService = new AccountService();
        }
        return accountService;
    }

    void addBalance(){
        account.balance += 10;
    }
    void reduceBalance(){
        account.balance -= 10;
    }
    void updateInfo(){
        account.bankName = "union bank";
    }
}

class Account {
    int balance;
    Date createdDate;
    Date updatedDate;
    String ownerName;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Account(int balance, Date createdDate, Date updatedDate, String ownerName, String ownerAddress, int accountId, String bankName) {
        this.balance = balance;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
        this.accountId = accountId;
        this.bankName = bankName;
    }

    String ownerAddress;
    int accountId;
    String bankName;


}


class Human{
    String name;
    int age;
    static Human human;
    public Human addName(String name){
        this.name = name;
        return this;
    }
    public Human addAge(int age){
        this.age = age;
        return this;
    }
}


