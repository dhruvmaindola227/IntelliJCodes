package com.multiThreading;

public class MultiThreading10 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 0 -> {
                    System.out.println("Kya dekhra hai?");
                    Thread.sleep(2000);
                }
                case 1 -> {
                    System.out.println("Aur koi kaam ni hai tere pas poora time snap dekhta rehta hai");
                    Thread.sleep(2000);
                }
                case 3 ->
                    System.out.println("jaa jake java padh nai toh external koot dega \n jaise aaj sushma aur external ne koota");
            }
        }
    }
}
