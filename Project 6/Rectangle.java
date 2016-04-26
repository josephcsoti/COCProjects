/*
Name: Joseph Csoti
Date: 8/5/15
Project info: Project #6 "Polymorphism"
Description: Creates shapes with given data using Polymorphism
*/

class Rectangle extends Shape {
    
    int width;
    int height;
    
    public Rectangle() {      
 
    }
    
    public Rectangle(int x, int y, int h, int w) {
        
        setX(x);
        setY(y);
        setHeight(h);
        setWidth(w);
    }
    
    int getHeight() {//returns an int for the rectangles height
        return height;
    }

    private void setHeight (int h) {//assign the rectangles height
        this.height = h;
    }

    int getWidth() {//returns an int for the rectangles width
        return width;
    }

    private void setWidth (int w) {//assign the rectangles width
         this.width = w;
    }
    
    @Override
    void display() {//display the rectangle as a text string containing the word Rectangle, and the x, y, width and height values
        System.out.println("---Rectangle---");
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());
        System.out.println("Width: " + getWidth());
        System.out.println("Height: " + getHeight());
        System.out.println("");
    }

    @Override
    double area() {//calculate and return a double of the area.
        double area;
        area = height * width;
        return area;
    }
    
}