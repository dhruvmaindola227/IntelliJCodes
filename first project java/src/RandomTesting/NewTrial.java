package RandomTesting;

import java.util.Objects;

//static factory methods.
//director@bciit.ac.in
public class NewTrial {
    public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("rohan");
    StringBuffer sb1 = new StringBuffer("rohan");
        System.out.println(sb == sb1);
        System.out.println(sb.equals(sb1));
        System.out.println(sb.toString().equals(sb1.toString()));
    }
}

class Account{
    public Account() {
    }

    private int accNo;
    private String accOwner;

    public int getAccNo() {
        return accNo;
    }

    public Account setAccNo(int accNo) {
        this.accNo = accNo;
        return this;
    }

    public String getAccOwner() {
        return accOwner;
    }

    public void setAccOwner(String accOwner) {
        this.accOwner = accOwner;
    }

    public Account(int accNo, String accOwner) {
        this.accNo = accNo;
        this.accOwner = accOwner;
    }
}


//SINGLETON PATTERN.
class AccountService{
    private static AccountService accountService;
    private AccountService() {

    }

    public static AccountService getAccountServiceObject(){
        if(accountService == null){
            accountService = new AccountService();
        }
        return accountService;
    }



    }//instance method.



