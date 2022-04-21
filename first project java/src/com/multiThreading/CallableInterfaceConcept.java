package com.multiThreading;

import java.util.concurrent.*;

public class CallableInterfaceConcept {

    public static void main(String[] args) throws Exception {

        DemoClass[] arr = {new DemoClass(5), new DemoClass(7),
                           new DemoClass(10), new DemoClass(11),
                           new DemoClass(20),new DemoClass(23),
                           new DemoClass(40),new DemoClass(30)};
        ExecutorService service = Executors.newFixedThreadPool(4);
        for (DemoClass dc : arr) {
            Future f= service.submit(dc);
            System.out.println(f.get());
        }
        service.shutdown();
    }
}

class DemoClass implements Callable {
    int num;
    DemoClass(int num){
        this.num=num;
    }
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" has to print the sum of first "+num + " numbers");
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum of first "+num+" numbers printed. Calculated by "+Thread.currentThread().getName());
        return sum;
    }
}
