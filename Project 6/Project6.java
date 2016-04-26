/*
Name: Joseph Csoti
Date: 8/5/15
Project info: Project #6 "Polymorphism"
Description: Creates shapes with given data using Polymorphism
*/

public class Project6 {

    private Shape [] array = new Shape[100];

    public static void main (String [] args) {
        Project6 xyz = new Project6();
        xyz.run();
    } 

    public void run () {
    int count = 0;

    array[count++] = new Circle(20, 20, 40);

    array[count++] = new Triangle(70, 70, 20, 30);

    array[count++] = new Rectangle(150, 150, 40, 40);

    for (int i = 0; i < count; i ++ ) {
        array[i].display();             
    }  

    int offset = 0;
    double totalarea = 0.0;

    while (array[offset] != null) {
        totalarea = totalarea + array[offset].area();
        offset++;
    }
    
    System.out.println("---Total Area---");
    System.out.println("Objects: " + offset);
    System.out.println("Area: " + totalarea);
    }
}