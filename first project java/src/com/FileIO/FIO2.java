package com.FileIO;

import java.io.File;

public class FIO2 {
    public static void main(String[] args) throws Exception{
        File f= new File("Dhruv");
        f.mkdir();
        File f2= new File(f,"dhrsuv.txt");
        f2.delete();
        System.out.println(f2.exists());
    }
}
