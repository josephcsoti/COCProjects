/*
Name: Joseph Csoti
Date: 8/5/15
Project info: Project #6 "Polymorphism"
Description: Creates shapes with given data using Polymorphism
*/

class Triangle extends Shape {
    
    int base;
    int height;

    public Triangle() {
        
    }
        
    public Triangle(int x, int y, int h, int b) {
        
        setX(x);
        setY(y);
        setHeight(h);
        setBase(b);
    }
    
    int getHeight() {//returns an int for the Triangle height
        return height;
    }

    void setHeight (int h) {//assign the Triangle height
        this.height = h;
    }

    int getBase() {//returns an int for the Triangle base
        return base;
    }

    void setBase (int b) {//assign the Triangle base
         this.base = b;
    }
    
    @Override
    void display() {//display the triangle as a text string containing the word Triangle, and the x, y, width and height values
        System.out.println("---Triangle---");
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());
        System.out.println("Base: " + getBase());
        System.out.println("Height: " + getHeight());
        System.out.println("");
    }

    @Override
    double area() {//calculate and return a double of the area.
        double area;
        area = .5 * base * height;
        return area;
    } 
}
