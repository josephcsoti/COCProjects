/**
* Name: Joseph Csoti
* Last Modified: 6/18/15
* Project info: #1 CovertTemp
* Description: Converts C to F in the console
**/

package project1.csoti.joseph;

//import 
import java.util.Scanner;

/**
 *
 * @author Student-HSLH133
 */
public class ConvertTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare Values
        double Far;
        double Cel;
        
        // Ask for User Input
        System.out.println("Enter The Celsius Value You Would Like To Convert");
        Scanner input = new Scanner(System.in);
        Cel = input.nextDouble();
        
        //Do Conversion
        Far = (9.0 / 5.0) * Cel + 32.0;
        
        //Output Answer
        System.out.println(Cel + " degrees Celsius is " + Far + " degrees in Fahrenheit");
    }
}
