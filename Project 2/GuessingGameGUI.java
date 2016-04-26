/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//import
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class GuessingGameGUI {

    public static void main(String[] args) {
        //set varaibles
        int num;
        int rnum;
        int hcount=0;
        int lcount=0;
        int tcount=0;
        
        //generate random number
        Random rgen = new Random();
        rnum = rgen.nextInt(32)+1;
        
        // asks for user input
        String numinput1 = JOptionPane.showInputDialog(null, "Enter a number between 1-32", "Guessing Game", JOptionPane.QUESTION_MESSAGE);
        num = Integer.parseInt(numinput1);      
        
        // checks if true
        while (num!=rnum && num!=-1){                                    
        
            //high
            if (num>rnum) {
                JOptionPane.showMessageDialog(null, "WRONG! Your guess was too high");
                hcount++;
                num = rnum + 1;
            }
            
            //low
            if (num<rnum) {
                JOptionPane.showMessageDialog(null, "WRONG! Your guess was too low");
                lcount++;
                num = rnum - 1;
            }
            
            String numinput2 = JOptionPane.showInputDialog(null, "Enter a number between 1-32", "Guessing Game", JOptionPane.QUESTION_MESSAGE);
            num = Integer.parseInt(numinput2);                          
            }      
        
        while (num==rnum) {
            //adds hcount to lcount +1 for total count
            tcount = hcount + lcount + 1;
            
            //hcount * builder
            StringBuilder tstar = new StringBuilder();
            StringBuilder hstar = new StringBuilder();
            StringBuilder lstar = new StringBuilder();
            
            //tstar
            for(int i = 0;i < tcount;i++) {
                tstar.append("*");           
            }
            
            //hstar
            for(int i = 0; i < hcount; i++) {
                hstar.append("*");           
            }
            
            //lstar
            for(int i = 0;i < lcount;i++) {
                lstar.append("*");           
            } 
            
            JOptionPane.showMessageDialog(null,"WINNER! The answer was " + num +
                                               "\n---" +
                                               "\nTotal Guesses: " + tcount +
                                               "\n" + tstar +
                                               "\nHigh Guesses: " + hcount +
                                               "\n" + hstar +
                                               "\nLow Guesses: " + lcount +
                                               "\n" + lstar);           
            num = -99;
            rnum = -98;
        }
        
        if (num==-1) {
            tcount = hcount + lcount;
                               
            //hcount * builder
            StringBuilder tstar = new StringBuilder();
            StringBuilder hstar = new StringBuilder();
            StringBuilder lstar = new StringBuilder();
            
            //tstar
            for(int i = 0;i < tcount;i++) {
                tstar.append("*");           
            }
            
            //hstar
            for(int i = 0; i < hcount; i++) {
                hstar.append("*");           
            }
            
            //lstar
            for(int i = 0;i < lcount;i++) {
                lstar.append("*");           
            } 
            
            JOptionPane.showMessageDialog(null,"LOSER! You have quit the game! The answer was " + rnum +
                                               "\n---" +
                                               "\nTotal Guesses: " + tcount +
                                               "\n" + tstar +
                                               "\nHigh Guesses: " + hcount +
                                               "\n" + hstar +
                                               "\nLow Guesses: " + lcount +
                                               "\n" + lstar);                   
                }
    }
}
