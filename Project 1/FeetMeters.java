/**
* Name: Joseph Csoti
* Last Modified: 6/18/15
* Project info: #1 FeetMeters
* Description: Converts feet to meters in the console
**/

package project1.csoti.joseph;

import java.util.Scanner;

public class FeetMeters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare Values
        double foot;
        double meter;
        
        // Ask for User Input
        System.out.println("Enter The Length In Feet");
        Scanner input = new Scanner(System.in);
        foot = input.nextDouble();
        
        //Do Conversion
        meter = foot / .305;
        
        //Output Answer
        System.out.println(foot + " Feet is equal to " + meter + " Meters");
    }
}
