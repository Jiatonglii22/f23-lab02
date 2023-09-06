package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle; 
import edu.cmu.cs.cs214.lab02.shapes.Circle; 
import edu.cmu.cs.cs214.lab02.shapes.Square; 


public class Main {
    public static void main(String[] args) {
        // rectangle
        Shape rectangle = new Rectangle(2, 3);

        Renderer rendererRect = new Renderer(rectangle);

        rendererRect.draw();

        //circle
        Shape circle = new Circle(5); 

        Renderer rendererCircle = new Renderer(circle); 

        rendererCircle.draw(); 

        //square 
        Shape square = new Square(4); 

        Renderer rendererSq = new Renderer(square); 

        rendererSq.draw(); 


    }
}
