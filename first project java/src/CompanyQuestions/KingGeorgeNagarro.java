package CompanyQuestions;

public class KingGeorgeNagarro {
    public static void main(String[] args) {
        int n = 3;
        //by simple observation we can see that the as n increases the answer forms a fibonacci pattern.
        //so square of the answer becuase we have to calculate for 2 sections.
        System.out.println(kingGeorge(n+2) * kingGeorge(n+2) );
    }
    static int kingGeorge(int n) {
        //golden ratio formula for finding the nth fibonacci number.
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, n)
                / Math.sqrt(5));
    }
}
