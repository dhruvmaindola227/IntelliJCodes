package RandomTesting;

public class NituQuestionHexaView {
    public static void main(String[] args) {
        System.out.println(answer(7,5));
    }

    public static int answer(int a, int b) {
        if(a < b){
            return answer(b , a);
        }
        else if(b!=0){
            return a * answer(a , b-1);
        }
        else{
            return 1;
        }
    }
}
