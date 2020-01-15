
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import java.math.*;

class Shape
{
    int area;
    public void calculateArea()
    {
        System.out.println("Area is: " + area);
    }
}

class Polygon extends Shape
{
    int num_of_sides;
    int length;
   public Polygon(int num_of_sides, int length)
    {
        this.num_of_sides = num_of_sides;
        this.length = length;
    }
       public void calculateArea()
    {
        
  double area = 
   ((Math.pow(length,2) * num_of_sides )/
          (4*Math.tan((Math.toRadians(180)/num_of_sides))));     
        System.out.println("Area is: " + area);
  
        
        // (side^2*n)/4*tan(180/n)
    }
    
}

public class Inheritance {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Polygon square = new Polygon(3,1);
        square.calculateArea();
    }
    
}


