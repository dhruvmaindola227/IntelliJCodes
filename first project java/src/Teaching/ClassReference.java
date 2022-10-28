package Teaching;

public class ClassReference {
    public static void main(String[] args) {
        NewChild np = new NewChild();
        np.sayMessage();
        np.sayMessage("aayush");
    }
}

class NewParent{
    public void sayMessage(){
        System.out.println("parent class method");
    }
}

class NewChild{
    public void sayMessage(){
        System.out.println("child class method");
    }

    public void sayMessage(String message){
        System.out.println(message + "child class method");
    }
}
