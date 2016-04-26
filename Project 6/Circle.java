/*
Name: Joseph Csoti
Date: 8/5/15
Project info: Project #6 "Polymorphism"
Description: Creates shapes with given data using Polymorphism
*/

class Circle extends Shape {
    
    int radius;

    public Circle() {
        
    }
        
    public Circle(int x, int y, int r) {
       
        setX(x);
        setY(y);
        setRadius(r);
    }
    
    int getRadius() {//returns an int for the circles radius
        return radius;
    }

    private void setRadius (int rad) {//assign the circles radius
        this.radius = rad;
    } 
    
    @Override
    void display() {//display the circle as a text string containing the word Circle, and the x, y and radius values
        System.out.println("---Circle---");
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());
        System.out.println("Radius: " + getRadius());
        System.out.println("");
    }

    @Override
    double area() {//calculate and return a double of the area.
        double area;
        area = Math.PI * radius * radius;
        return area;
    }
}