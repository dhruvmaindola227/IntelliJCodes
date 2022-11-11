package Teaching;

public class Bacche implements Comparable<Bacche> {
    int age;
    String name;
    String gender;

    @Override
    public int compareTo(Bacche o) {
        return this.age - o.age;
    }

    public Bacche(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    Bacche(){}

    @Override
    public String toString() {
        return age + "  " + name + "  " +  gender;
    }
}


