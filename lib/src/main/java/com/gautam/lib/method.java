package com.gautam.lib;

public class method {
    //main
    public static void main ( String args [] ){
        int x = 5, y = 6, result;
        result = sum(x,y);
        System.out.println("Results is - " +result);
        // test declaration
        dec();

    }

    //method with parameters
    public static int sum (int a, int b ) {
        int retVal;
        retVal = a + b ;
        return  retVal;
    }

    //method without any parameters
    public static int dec (){
        System.out.println("test Declaration");
        return 0;
    }
}
