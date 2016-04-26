
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Numbers {

    public static void main(String[] args) throws FileNotFoundException {
        
        int nAmount;
        int rNum;
        
        java.io.File file = new java.io.File("numbers.txt");
        PrintWriter numberstxt = null;

        numberstxt = new PrintWriter(file);
        
        Random rand1 = new Random();     
        nAmount = rand1.nextInt(10) + 5;
        
        numberstxt.println(nAmount);
        
        Random rand2 = new Random();        

        for(int i=0; i<nAmount; i++) {
            
            rNum = rand2.nextInt(99) + 0;
            numberstxt.println(rNum);
        }
        
        numberstxt.close();
    }
} 
        //////////////////////////////////////////////////////

