import java.util.Scanner;

public class VendingMachine {

    static int credit;
    static double creditRaw;
    
    static int nickels = 5;
    static int dimes = 5;
    static int quarters = 5;
    static int dollars = 5;
    
    int qCount = 0;
    int dCount = 0;
    int nCount = 0;
    
    static int dmAmount = 4;
    static int laysAmount = 2;
    static int cheeseAmount = 3;
    static int snickersAmount = 5;

    public static void main(String[] args) {
        
        VendingMachine x = new VendingMachine();
        
        int menuChoice;
        while (true) {
            
            creditRaw = credit * .01;
            String creditString = String.format("%.2f", creditRaw); 
            //outputs title card 
            System.out.println("---------------" + "\nJoe's Vendaro |" + "\n---------------"); 
            
            //outputs credit 
            System.out.println("Credit: " + creditString); 
            System.out.println(""); 
            System.out.println("---Products---"); 
            System.out.println("1) Dihydrogen Monoxide: $1.00"); 
            System.out.println("2) Lays Chips: $0.75"); 
            System.out.println("3) Cheeze-Its: $1.50"); 
            System.out.println("4) Snickers: $1.25"); 
            System.out.println(""); 
            System.out.println("---Options---"); 
            System.out.println("5) Insert Coins"); 
            System.out.println("6) Change"); 
            
            //takes choice input 
            Scanner menuInput = new Scanner(System.in); 
            menuChoice = menuInput.nextInt(); 
            
            switch(menuChoice) {
                
                case 1: menuChoice=1;
                    //checks if in stock 
                    if (dmAmount>0) { 
                        //checks if enough money 
                        if (credit>=100) { 
                            vend(100);
                            System.out.println("---------------" + "\nDispenser |" + "\n---------------"); 
                            System.out.println("Your Dihydrogen Monoxide has been dispensed"); 
                            System.out.println("."); 
                        } 
                        else { 
                            System.out.println("NOT ENOUGH CREDIT"); 
                        }
                    }
                    else { 

                        String soldMessage = ("ITEM OUT OF STOCK!");
                         vend(soldMessage); 
                    } 
                    break; 
                
                case 2: menuChoice=2; 
                    //checks if in stock 
                    if (laysAmount>0) { 
                        //checks if enough money 
                        if (credit>=75) { 
                            vend(75);
                            System.out.println("---------------" + "\nDispenser |" + "\n---------------"); 
                            System.out.println("Your Lay's Chips has been dispensed"); 
                            System.out.println("."); 
                        } 
                        
                        else { 
                            System.out.println("NOT ENOUGH CREDIT");
                        } 
                    } 
                    
                    else { String soldMessage = ("ITEM OUT OF STOCK!");
                    vend(soldMessage);
                    } 
                    break; 
                
                case 3: menuChoice=3; 
                    
                    //checks if in stock 
                    if (cheeseAmount>0) { 
                        //checks if enough money 
                        if (credit>=150) { 
                            vend(150);
                            System.out.println("---------------" + "\nDispenser |" + "\n---------------"); 
                            System.out.println("Your Cheese-It's has been dispensed"); 
                            System.out.println("."); 
                        } 
                        
                        else { 
                            System.out.println("NOT ENOUGH CREDIT");
                        } 
                    } 
                    
                    else { 
                        String soldMessage = ("ITEM OUT OF STOCK!");
                        vend(soldMessage); 
                    } 
                    break; 
                
                case 4: menuChoice=4; 
                    //checks if in stock 
                    if (snickersAmount>0) { 
                        //checks if enough money 
                        if (credit>=125) { 
                            vend(125);
                            System.out.println("---------------" + "\nDispenser |" + "\n---------------");
                            System.out.println("Your Snicker's has been dispensed");
                            System.out.println("."); 
                        } 
                        
                        else { 
                            System.out.println("NOT ENOUGH CREDIT");
                        } 
                    } 
                    
                    else { 
                        String soldMessage = ("ITEM OUT OF STOCK!");
                        vend(soldMessage); 
                    } 
                    break; 
                
                case 5: menuChoice=5; 
                
                    credit = insertMoney(); 
                    break; 
                
                case 6: menuChoice=6;
               
                    System.out.println(x.changeReturn());  
                    break;
                
                default: System.out.println("INVAILD INPUT"); 
            } 
        } 
    } 
    
    public static int insertMoney() {
        
        int exit=0;
        int moneyChoice;
        Scanner moneyInput = new Scanner(System.in);
        
        while(exit==0) {
            
            creditRaw = credit * .01;
            String creditString2 = String.format("%.2f", creditRaw); 

            //prints menu 
            System.out.println("---------------" + "\nInsert Coins |" + "\n---------------"); 
            System.out.println("Credit: " + creditString2); 
            System.out.println(""); 
            System.out.println("1) Dollar Bills Ya"); 
            System.out.println("2) Quarters"); 
            System.out.println("3) Dimes"); 
            System.out.println("4) Nickels"); 
            System.out.println("5) Main Menu"); 

            //takes input 
            moneyChoice = moneyInput.nextInt(); 

            switch(moneyChoice) { 

                case 1: moneyChoice=1; 
                    credit = credit + 100; 
                    break; 

                case 2: moneyChoice=2; 
                    credit = credit + 25; 
                    break; 

                case 3: moneyChoice=3; 
                    credit = credit + 10; 
                    break;

                case 4: moneyChoice=4; 
                    credit = credit + 5; 
                    break; 

                case 5: moneyChoice=5;
                    exit = 1;
                    break; 

                default: 
                    System.out.println("Invaild Input. Please try again!"); 
            }      
        }
        return credit;
    } 
    
    public static int vend(int x) { 
        credit = credit - x; 
        return credit; 
    } 
    
    public static String vend(String x) { 
        System.out.println(x); 
        return x; 
    } 
    
    public String changeReturn() {       
        
        while(credit>0) {
            
            while(credit>=25 && quarters>0) {               
                credit = credit - 25;
                quarters--;
                qCount++;
            }
            
            while(credit>=10 && dimes>0) {
                credit = credit - 10;
                dimes--;
                dCount++;
            }
            
            while(credit>=5 && nickels>0) {
                credit = credit - 5;
                nickels--;
                nCount++;
            }
            credit = 0;    
        }
        
        String changeString = ("---Your Change---" + 
                              "\n" +
                              "\nQuarters: " + qCount +
                              "\nDimes: " + dCount +
                              "\nNickels: " + nCount );
        
        if (quarters==0 ^ dimes==0 ^ nickels==0) {
            changeString = changeString + "\nNot Enough Change! You Have Been Swindled";
            credit = 0;
        }
        
        return  changeString;
    } 
} 