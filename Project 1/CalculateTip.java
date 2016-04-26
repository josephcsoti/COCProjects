/**
* Name: Joseph Csoti
* Last Modified: 6/20/15
* Project info: #1 CalculateTip
* Description: Calculates tip in the console from user inputed data
**/

package project1.csoti.joseph;

// import scanner
import java.util.Scanner;

public class CalculateTip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare Values
        double tip;
        double rate;
        double subtotal;
        double total;
        
        // Ask for User Input
        System.out.println("Enter the subtotal amount in dollars (EX: $75 = 75)");
        Scanner inputSubtotal = new Scanner(System.in);
        subtotal = inputSubtotal.nextDouble();
        
        // Ask for User Input
        System.out.println("Enter the tiprate in percent (EX: 15% = 15)");
        Scanner inputrate = new Scanner(System.in);
        rate = inputrate.nextDouble();
        
        //math for tip
        tip = subtotal * (rate / 100);
        
        //math for total
        total = subtotal + tip;
        
        //output answer
        System.out.println("-----");
        System.out.printf("Subtotal: $%.2f\n",subtotal);
        System.out.print("Tip Rate: " + rate + "%");
        System.out.println("");
        System.out.printf("Tip: $%.2f\n",tip);
        System.out.printf("Total: $%.2f\n",total);
    }
}
