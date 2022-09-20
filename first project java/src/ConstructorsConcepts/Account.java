package ConstructorsConcepts;

public class Account {
    String accName;
    int accNo;
    int balance;
} //data class.


class AccountService{
    static int getCurrentBalance(Account object){
        return object.balance;
    }
}

// AccountService.getCurrentBalance(nitu)
// AccountService.getCurrentBalance(dhruv)
// AccountService.getCurrentBalance(kritika)

