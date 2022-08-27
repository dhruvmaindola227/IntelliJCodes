package RandomTesting;

public class Subject {
    public static void main(String[] args) {
        Topic t = new Topic1();
        Topic t1 = new Topic2();
        Topic t2 = () -> System.out.println("lambda vvala");
        t.understand();
        t1.understand();
        t2.understand();
    }
}

interface Topic
{
    void understand();
}
final class Topic1 implements Topic {
    public void understand()
    {
        System.out.println("Got it");
    }
} class Topic2 implements Topic {
    public void understand()
    {
        System.out.println("understand");
    }
}
