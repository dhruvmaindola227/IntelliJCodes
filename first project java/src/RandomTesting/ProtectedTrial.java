package RandomTesting;

public class ProtectedTrial {
    protected int number;

    public ProtectedTrial() {
    }

    public ProtectedTrial(int number) {
        this.number = number;
    }
}

class SubClassSamePackage extends ProtectedTrial{
    public SubClassSamePackage() {
    }

    public SubClassSamePackage(int number) {
        super(number);
    }

    public static void main(String[] args) {
        ProtectedTrial pt = new ProtectedTrial(2);
        SubClassSamePackage sbp = new SubClassSamePackage(2);
        System.out.println("protected class original number -> " + pt.number);
        System.out.println("Subclass number -> " + sbp.number);
    }
}
