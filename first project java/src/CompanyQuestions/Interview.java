package CompanyQuestions;

public class Interview {
    public static void main(String[] args) {
        Service service = Service.getServiceObject();
        Service service2 = Service.getServiceObject();
        System.out.println(service == service2);
    }
}

class AccountNew {
    private long balance;

    public AccountNew() {
    }

    public AccountNew(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}

class Service{
    private static Service service;

    private Service(){}

    public static Service getServiceObject(){
        if(service == null){
            service = new Service();
        }
        return service;
    }

    public long getBalance(AccountNew account){
        return account.getBalance();
    }
}