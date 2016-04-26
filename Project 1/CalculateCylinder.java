/**
* Name: Joseph Csoti
* Last Modified: 6/20/15
* Project info: #1 CalculateCylinder
* Description: Calculates volume of cylinder in console 
**/

package project1.csoti.joseph;

// import scanner
import java.util.Scanner;
        
public class CalculateCylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //set var types + pi value
        double area;
        double radi;
        double length;
        double volume;
        
        // Ask for User Input of radi
        System.out.println("Enter The Radius Of The Cylinder");
        Scanner input = new Scanner(System.in);
        radi = input.nextDouble();
        
        //Do math to find area from radi
        area = radi * radi * 3.14159;
        
        //input for length
        System.out.println("Enter The Length Of The Cylinder");
        Scanner input2 = new Scanner(System.in);
        length = input2.nextDouble();
        
        //math to find volume
        volume = area * length;
        
        //Output Answer
        System.out.println("The Volume Of The Cylinder is: " + volume);
    }
}
