/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import arithmetic.ArithmeticBase.Operator;
import java.util.Scanner;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * date 02/19
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Operator plus = Operator.PLUS;
       Operator minus = Operator.MINUS;
       Operator times = Operator.TIMES;
       Operator divide = Operator.DIVIDE;
       
       ArithmeticBase r= new ArithmeticBase();
       double result = r.calculate(1,times,2);
       System.out.println("result :" +result); 
    
    }





}

