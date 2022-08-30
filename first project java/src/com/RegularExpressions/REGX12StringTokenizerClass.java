package com.RegularExpressions;

import java.util.StringTokenizer;

public class  REGX12StringTokenizerClass {
    public static void main(String[] args) {
        StringTokenizer st= new StringTokenizer("23/23/3","/");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
