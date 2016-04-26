import java.util.Scanner;

public class Infestation {

    static int population = 200000;
    static int agent = 1;

    public static void main(String[] args) {       
        
        ///////////////////////////////////////////////
        Human Human = new Human();
        System.out.println("Human");
        System.out.println("---");
        System.out.print("Name: ");
        
        Scanner inputName = new Scanner(System.in);
        String name = inputName.next();
        
        Human.setName(name);
        
        System.out.print("X: ");
        
        Scanner inputX = new Scanner(System.in);
        int x = inputX.nextInt();         
        
        Human.setXPosition(x);
        
        System.out.print("Y: ");
        
        Scanner inputY = new Scanner(System.in);
        int y = inputY.nextInt();
        
        Human.setYPosition(y);
        
        System.out.print("Weapon: ");
        
        Scanner inputWeapon = new Scanner(System.in);
        String weapon = inputWeapon.next();
        
        Human.weapon(weapon);
     
        ///////////////////////////////////////////////
        Agent Agent = new Agent();
                
        System.out.println("");
        System.out.println("Agent");
        System.out.println("---");
        System.out.print("ID: ");
        
        Scanner inputId = new Scanner(System.in);
        String id = inputId.next();
        
        Agent.setID(id);
        
        System.out.print("X: ");
        
        Scanner inputXA = new Scanner(System.in);
        int xA = inputXA.nextInt();
        
        Agent.setXPosition(xA);        
        
        System.out.print("Y: ");
       
        Scanner inputYA = new Scanner(System.in);
        int yA = inputYA.nextInt();
        
        Agent.setYPosition(yA);
        
        ///////////////////////////////////////////////
        System.out.println("");
        System.out.println("Battle Log");
        System.out.println("---");
        
        System.out.println("Agent '" + id + "' is at (" + Agent.xPosition + "," + Agent.xPosition + ")");
        System.out.println(name + " is at (" + Human.xPosition + "," + Human.xPosition + ")");
        
        Agent.move(x, y);
                
        if(Agent.inRange == true) {
            System.out.println("Agent '" + id + "' is in range of " + name);
            System.out.println("Agent '" + id + "' teleported to " + name + "'s position");
        }  
        else {
            System.out.println("Agent '" + id + "' is not in range of a human");
        }
        
        Agent.attack();
        
        if(Agent.inRange == true && Agent.attackState == 0) {
            System.out.println(name + "'s " + weapon + " is useless");
            System.out.println("Agent '" + id + "' killed " + name);   
        }
        else {}
        
        if(Agent.inRange == true && Agent.attackState == 1) {
            System.out.println(name + "'s " + weapon + " is effective");
            System.out.println(name + " killed Agent '" + id + "'");   
        }
        else {} 
        
    }
}

