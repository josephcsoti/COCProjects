/*
Name: Joseph Csoti
Date: 8/5/15
Project info: Project #6 "Polymorphism"
Description: Creates shapes with given data using Polymorphism
*/

abstract class Shape {
    
    int x;
    int y;
   
    int getX() {//returns an int for the shapes x position
        return x;
    }

    void setX(int x) {//assign the shapes x position
        this.x = x; 
    }

    int getY() {//returns an int for the shapes y position
        return y;
    }

    void setY(int y) {//assign the shapes y position
        this.y = y;
    }
   
    Shape() {
        
    }
    
    Shape(int x, int y) {
        
        setX(x);
        setY(y); 
    }

    abstract void display();

    abstract double area();  
}