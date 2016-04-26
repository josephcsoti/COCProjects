
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) throws FileNotFoundException {
        
        int count = 0;        
        int min = 0;
        int number;
        int lineCount = 0;
        
        java.io.File file = new java.io.File("numbers.txt");
        
        Scanner numbersIn = new Scanner(file);
        
        lineCount = Integer.parseInt(numbersIn.nextLine());
        
        int[] numAray = new int[lineCount];
                
        while(numbersIn.hasNext()) {
            
            number = Integer.parseInt(numbersIn.nextLine());
            
            numAray[count] = number;
            
            count++;
        }       
                
        java.io.File file2 = new java.io.File("numout.txt");
        
        PrintWriter numberstxt = new PrintWriter(file2);
        
        for (int i = 0; i < numAray.length; i++)
        {
            int index = i;
            for (int j = i + 1; j < numAray.length; j++)
                if (numAray[j] < numAray[index]) //Finds smallest number
                    index = j;

            int smallerNumber = numAray[index];  //Swap
            numAray[index] = numAray[i];
            numAray[i] = smallerNumber;
            
            numberstxt.println(numAray[i]);

        }
        
        numberstxt.close();

    }
}