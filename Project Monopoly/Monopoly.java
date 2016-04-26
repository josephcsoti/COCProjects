/**
* Name: Joseph Csoti
* Last Modified: 7/2/15
* Project info: Test/Quiz #1
* Description: Calculates game average in GUI + displays some info about the game
**/

import javax.swing.JOptionPane;


public class Monopoly {

    public static void main(String[] args) {
        
        int inputPane;
        int numberOf;
        int gameNumber;
        double inputedNumber;
        double numAdder=0;
        double averageScoreRaw;
        
        while(true) {
            //Option Pane String
            String menuPane = (  "\nMonopoly" +
                        "\n---" +
                        "\n1) Average Money Calculator" +
                        "\n2) Game Info" +
                        "\n3) Quit" +
                        "\n");
        
            //Show pane
            String menuInput = JOptionPane.showInputDialog(null, menuPane + "\nEnter Your Option Number Below ", "Monopoly", JOptionPane.QUESTION_MESSAGE);
            inputPane = Integer.parseInt(menuInput);
        
            switch (inputPane) {
            
                case 1: inputPane=1;
                
                    //asks for number of terms?
                    String numberOfInput = JOptionPane.showInputDialog(null, "Enter the number of games", "Monopoly - Average Money Calculator", JOptionPane.QUESTION_MESSAGE);
                    numberOf = Integer.parseInt(numberOfInput);
                    
                    gameNumber = numberOf + 1;

                        for(int i=0; i < numberOf; i++){                        
                            
                            //calculates game number
                            gameNumber = gameNumber - 1;
                                    
                            //Asks for money
                            String numberInput = JOptionPane.showInputDialog(null, "Enter the amount of money won --" + " Game Entries Left: " + gameNumber, "Monopoly - Average Money Calculator", JOptionPane.QUESTION_MESSAGE);
                            inputedNumber = Double.parseDouble(numberInput);
                
                            //adds inputed numbers together
                            numAdder = numAdder + inputedNumber;                        
                        
                        }
             
                    //caluates av
                    averageScoreRaw = numAdder / numberOf;
                
                    //transforms into averageScoreRaw intp X.yz format
                    String averageScore = String.format("%.2f", averageScoreRaw);
                
                    //message box
                    JOptionPane.showMessageDialog(null,"Your average game money is: $" + averageScore);              
                    break;
                
                case 2: inputPane=2;
                
                    JOptionPane.showMessageDialog(null, "Game Info" +
                                                        "\n---" +
                                                        "\nMonopoly is a game where you buy and build property to gain money and make others bankrupt" +
                                                        "\n" +
                                                        "\nWhy I Like It" +
                                                        "\n---" +
                                                        "\nI like this game because you feel like you can control the world");
                    break;
                
                case 3: inputPane=3;
            
                    JOptionPane.showMessageDialog(null, "You have quit the program! Exiting the system...");
                    System.exit(0);
                    
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Input. Please Enter Another Number");
                    break;
        }
      }
    }
}
