package com.selfPractice;

import java.sql.*;
import java.sql.*;
class Q1JavaPractical{
    public static void main(String args[]){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","nikhil");

            PreparedStatement stmt=con.prepareStatement("insert into Emp(empno) values(?)");
            stmt.setInt(1,1019);//1 specifies the first parameter in the query

            int i=stmt.executeUpdate();
            System.out.println(i+" records inserted");

            con.close();

        }catch(Exception e){ System.out.println(e);}

    }
}
