public class Agent {
    
    String id;
    static int xPosition;
    int xBounds = 500;
    static int yPosition;
    int yBounds = 500;
    static int attackState;
    static boolean inRange = false; 
    
    Agent() {
        id = "007";
        xPosition = 500;
        yPosition = 500;
    }
    
    Agent(String id, int xPosition, int yPosition) {
        
        this.id = id;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    
    public String getID() {

        return id;
    }
    
    public String setID(String id) {
        
       this.id = id;
       return id;
    }   
    
    public int getXPosition() {
        
        return xPosition;
    }
    
    public void setXPosition(int xPosition) {
        
        if(xPosition <= xBounds) {
            this.xPosition = xPosition;
        }
        else {
            System.out.println("Agent " + "'" + id + "'" + " X-Position of " + "'" + xPosition + "'" + " Is Out Of Bounds");
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
            System.out.println("Agent " + "'" + id + "'" + " Y-Position of " + "'" + yPosition + "'" + " Is Out Of Bounds");
        }
    }
    
    public void move(int xPosition, int yPosition) {
        if((Math.abs(this.xPosition - xPosition) <= 15) && Math.abs(this.yPosition - yPosition) <= 15)
        {
            
            this.xPosition = xPosition;
            this.yPosition = yPosition;
            
            inRange = true;
            
        }
        else {
            inRange = false; 
        }
    }
    
    public void attack() {
        
        if(inRange == true) {
                           
            if( Human.weapon.equals("Gun") || Human.weapon.equals("Laser") || Human.weapon.equals("Chainsaw") ) {
                attackState = 1;
            }
            else {
                attackState = 0; 
            } 
        }
        
        else{
            attackState = 2;
        }         
    }                          
    
    @Override
    public String toString() {
        
        return id;
    }
}


