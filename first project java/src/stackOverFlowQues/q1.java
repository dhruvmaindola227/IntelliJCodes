package stackOverFlowQues;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        // write your code here
        Map<String, HashMap<String,String>> map = new HashMap<>();
        map.put("123456789" , new HashMap<>());
        map.put("987654321" , new HashMap<>());
        map.get("123456789").put("pin number" , "123456");
        map.get("123456789").put("phone number" , "0000000000");
        map.get("123456789").put("name" , "xyz");
        map.get("123456789").put("balance" , "20000");
        map.get("987654321").put("pin number" , "654321");
        map.get("987654321").put("phone number" , "1111111111");
        map.get("987654321").put("name" , "zyx");
        map.get("987654321").put("balance" , "10000");
        boolean valid = false;
        Scanner in = new Scanner(System.in);
        while(!valid) {
            System.out.println("Enter Your Card Number");
            String card = in.next();
            System.out.println("Enter Your Pin Number");
            String pin = in.next();
            String actualPin = map.get(card).get("pin number");
            valid = pin.equals(actualPin);
            if (!valid) {
                System.out.println("Wrong Card Number or Pin Number");
                System.out.println("Try Again");
            } else {
                System.out.println("Congratulations on logging in");
                Scanner question = new Scanner(System.in);
                System.out.println("Press 1 to Withdraw");
                System.out.println("Press 2 to Deposit");
                System.out.println("Press 3 to Check Amount");
                String operation = question.next();
                switch(operation) {
                    case "1":
                        System.out.println("How much would you like to withdraw");
                        break;
                    case "2":
                        System.out.println("How much would like to deposit?");
                        break;
                    case "3":
                        System.out.println("Here is your total amount in your bank");
                        break;
                    default:
                        System.out.println("Press 4 to exit");
                }

            }
        }

    }
}
