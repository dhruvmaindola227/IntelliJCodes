package CompanyQuestions;

public class JailBreakNagarro {
    public static void main(String[] args) {
        System.out.println("He must make " + calculateJumps(5 , 1 , 2 , new int[]{9 , 10}) + " jumps");
    }
    static int calculateJumps(int jumpCapacity, int slip, int n, int walls[])
    {
        int jumps = 0;
        for(int i=0;i<n;i++) {
            int reach = jumpCapacity;
            int jump = 1;
            while(reach < walls[i]) {
                reach += (jumpCapacity - slip);
                jump += 1;
            }
            jumps += jump;
        }
        return jumps;
    }
}
