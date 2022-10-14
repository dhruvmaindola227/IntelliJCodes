package CompanyQuestions;

public class KnoldusQuestion6 {
    public static void main(String[] args) {
        System.out.println(fnc());
        String s = fnc();
        System.out.println(s);
        char[] ch = s.toCharArray();
        for (int i = 2; i < ch.length; i+=3) {
            ch[i] = 'x';
        }
        String answer = new String(ch);
        System.out.println(answer);
    }

    public static String fnc() {
        String challengeToken = "34ve45t3v3";
        String answer = "kritika";
        return answer + challengeToken;
    }


}
