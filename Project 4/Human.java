
public class Human {
    
    String name;
    static String weapon;
    static int xPosition;
    int xBounds = 500;
    static int yPosition;
    int yBounds = 500;
    
    Human() {
        name = "John";
        xPosition = 0;
        yPosition = 0;
        weapon = "Hands";
    }
    
    Human(String name, int xPosition, int yPosition, String weapon) {
        
        this.name = name;              
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.weapon = weapon;
    }
    
    public String getName() {
        
        return name;
    } 
    
    public String setName(String name) {
        
        this.name = name;
        return name;
    }   
    
    public String weapon(String weapon) {
        
        this.weapon = weapon;
        return weapon;
    }
    
    public int getXPosition() {
        
        return xPosition;
    }
    
    public void setXPosition(int xPosition) {
        if(xPosition <= xBounds) {
            this.xPosition = xPosition;
        }
        else {
            System.out.println("Human " + "'" + name + "'" + " X-Position of " + "'" + xPosition + "'" + " Is Out Of Bounds");
        }
    }
    
    public int getYPosition() {
        
        return yPosition;
    }
    
    public void setYPosition(int yPosition) {
        if(yPosition <= yBounds) {
            this.yPosition = yPosition;
        }
        else {
            System.out.println("Human " + "'" + name + "'" + " Y-Position of " + "'" + yPosition + "'" + " Is Out Of Bounds");
        }
    } 
 
    @Override
    public String toString() {
        
        return name;
    }
}
