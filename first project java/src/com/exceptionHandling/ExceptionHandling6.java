package com.exceptionHandling;

 class ExceptionHandling6 {
    static ArithmeticException e;
    static ArithmeticException e1=new ArithmeticException();

  public static void main(String[] args) {

   System.out.println(e);
   throw e;

  }
}

