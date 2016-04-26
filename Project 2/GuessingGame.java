/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//import
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

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
        System.out.println("Please enter a number between 1 - 32");
        Scanner inputnum = new Scanner(System.in);
        num = inputnum.nextInt();        
        
        // checks if true
        while (num!=rnum && num!=-1){                                    
        
            //high
            if (num>rnum) {
                System.out.println("WRONG! Your guess was too high");
                hcount++;
                num = rnum + 1;
            }
            
            //low
            if (num<rnum) {
                System.out.println("WRONG! Your guess was too low");
                lcount++;
                num = rnum - 1;
            }
            
            // asks for user input
            System.out.println("Please enter a number between 1 - 32");
            Scanner inputnum2 = new Scanner(System.in);
            num = inputnum2.nextInt();                         
        }      
        
        while (num==rnum) {
            //adds hcount lcount for total count
            tcount = hcount + lcount + 1;
                               
            System.out.println("WINNER! The answer was " + num);
            System.out.println("---");
        
            System.out.println("Total Guesses: " + tcount);
        
            for(int i = 0;i < tcount;i++) {
                System.out.printf("*");           
            }
        
            System.out.println("");
            System.out.println("High Guesses: " + hcount);
        
            for(int i = 0; i < hcount; i++) {
                System.out.printf("*");           
            }
        
            System.out.println("");
            System.out.println("Low Guesses: " + lcount);
        
            for(int i = 0;i < lcount;i++) {
            System.out.printf("*");           
            }
            System.out.println("");
            
            num = -99;
            rnum = -98;
        }
        
        if (num==-1) {
            tcount = hcount + lcount;
                               
            System.out.println("LOSER! You have quit the game! The answer was " + rnum);
            System.out.println("---");
        
            System.out.println("Total Guesses: " + tcount);
        
            for(int i = 0;i < tcount;i++) {
                System.out.printf("*");           
                }
        
                System.out.println("");
                System.out.println("High Guesses: " + hcount);
        
                for(int i = 0; i < hcount; i++) {
                    System.out.printf("*");           
                }
        
                System.out.println("");
                System.out.println("Low Guesses: " + lcount);
        
                for(int i = 0;i < lcount;i++) {
                System.out.printf("*");           
                }
                System.out.println("");                   
                }
    }
}
