/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * date 07/05/21
 */
public class ArithmeticBase 
{
 public double x,y;
 public enum Operation{
            PLUS,MINUS,TIMES,DIVIDE,MODULO
        };
        
    double calculate(double x, double y) 
        {
        
        System.out.println("Enter arithmetic operation to Perform: ");
        Scanner sc =new Scanner(System.in);
        String s= sc.next();
        switch (s.toUpperCase()) 
        {
            case "PLUS":
                return x + y;
            case "MINUS":
                return x - y;
            case "TIMES":
                return x * y;
            case "DIVIDE":
                return x / y;
            case "MODULO":
                return x % y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
