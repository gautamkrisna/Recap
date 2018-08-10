package com.gautam.lib;

/**
 * Created by Gautam on 10-08-2018.
 */

public class ArithematicOperations {
    public static void main ( String [] Args) {
        int num1 = 20;
        int num2 = 30;

        //Sum
        int sum = num1 + num2 ;
        System.out.println("Sum - " + sum);

        // diff
        int diff = num1 - num2;
        System.out.println("Diff - "+ diff );

        // mul
        int mul = num1 * num2 ;
        System.out.println("Mul - "+ mul);

        // Div
        int div = num2 / num1 ;
        System.out.println("Div - "+ div);

        // mod
        int mod = num2 % num1;
        System.out.println("Mod - "+ mod);

        // div fraction
        System.out.println("Div fraction - " + div + mod);

        //Unary op
        System.out.println("Uniary of sum - " + ++sum);

        //Relation
        System.out.println( "num1 != num2 : " + (num1 != num2));

    }
}
