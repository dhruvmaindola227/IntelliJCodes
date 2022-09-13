package RandomTesting;// Java program for the above approach

public class Threading {

    // Starting counter
    int counter = 1;
    int range;
    // Function to print odd numbers
    public void printOddNumber() //pascal case convention
    {
        synchronized (this)
        {
            while (counter < range) {
                // If count is odd then print else wait for the counter to become even.
                while (counter % 2 == 0) {
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.println(
                        counter + " " + Thread.currentThread().getName());
                counter++;
                notify();
            }
        }
    }

    // Function to print even numbers
    public void printEvenNumber()
    {
        synchronized (this)
        {
            while (counter < range) {
                // If count is odd then print otherwise wait for the count to become odd.
                while (counter % 2 != 0) {
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.println(
                        counter + " " + Thread.currentThread().getName());
                // Increment counter
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args)
    {

        // Create an object of class
        Threading threading = new Threading();
        threading.range = 10;
        // Creating the two threads thread t1 and t2.
        Thread t1 = new Thread(threading::printOddNumber, "Thread - 1");
        Thread t2 = new Thread(threading::printEvenNumber, "Thread - 2");
        // Starting both threads
        t1.start();
        t2.start();
    }
}
