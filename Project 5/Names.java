import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Names {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        int count = 0;        
        int lineCount;
        
        String name;
        
        java.io.File file = new java.io.File("names.txt");
        
        Scanner namesIn = new Scanner(file);
        
        lineCount = Integer.parseInt(namesIn.nextLine());
        
        String[] nameAray = new String[lineCount];
                
        while(namesIn.hasNext()) {
            
            name = namesIn.nextLine();
            
            nameAray[count] = name;
            
            count++;
        }       
                
        java.io.File file2 = new java.io.File("nameout.txt");
        
        PrintWriter namestxt = new PrintWriter(file2);
        
        
        for (int i = 0; i < nameAray.length; i++) 
        {
            for (int j = i + 1; j < nameAray.length; j++) 
            {
                if (nameAray[i].compareTo(nameAray[j])>0) 
                {
                    String temp = nameAray[i];
                    nameAray[i] = nameAray[j];
                    nameAray[j] = temp;
                }                 
            }
            
            namestxt.println(nameAray[i]);
        }          
        
        namestxt.close();
    }
}
