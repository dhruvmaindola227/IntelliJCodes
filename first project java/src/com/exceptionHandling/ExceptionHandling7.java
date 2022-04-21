package com.exceptionHandling;

class ExceptionHandling7 extends Throwable //did this because the compiler said that a throwable object has to be thrown
        //so i extended the class from Throwable class to make ExceptionHandling7's objects a throwable object.
        {
    public static void main(String[] args) throws ExceptionHandling7 //Since we are throwing an exception , we have to tell the
                                                                    // compiler that psvm will throw an exception of type
                                                                     //ExceptionHandling7 since we are throwing its object and it is
                                                                     //of throwable type because we extended this class from the
                                                                    //Throwable Super class.
    {
            throw new ExceptionHandling7();
//        throw new NullPointerException();
    }
}
