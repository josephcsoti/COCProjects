/**
* Name: Joseph Csoti
* Last Modified: 6/23/15
* Project info: #1 CalculateTipGUI
* Description: Calculates tip in the gui from user inputed data
**/

package project1.csoti.joseph;

// import 
import javax.swing.JOptionPane;

public class CalculateTipGUI {

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
        String input1 = JOptionPane.showInputDialog(null, "What is the subtotal? (EX: $100 = 100)", "Tip Calculator", JOptionPane.QUESTION_MESSAGE);
        subtotal = Double.parseDouble(input1);
        
        // Ask for User Input
        String input2 = JOptionPane.showInputDialog(null, "What is the tip rate? (EX: %15 = 15)", "Tip Calculator", JOptionPane.QUESTION_MESSAGE);
        rate = Double.parseDouble(input2);
        
        //math for tip
        tip = subtotal * (rate / 100);
        
        //math for total
        total = subtotal + tip;
        

        
        //craete string
        String tip2 = String.format("%.2f", tip );
        String total2 = String.format("%.2f", total );
        String subtotal2 = String.format("%.2f", subtotal );
        String rate2 = String.format("%.2f", rate );
        
        //dilog output
        JOptionPane.showMessageDialog(null, "Subtotal:     $" + subtotal2
                                            + "\nTip:               $" + tip2
                                            + "\n-------------------------------"
                                            + "\nTotal:           $" + total2);
    }
}