
package pl.edu.ur.oopl7;

import java.util.Random;


public class Punkt3D extends Punkt2D
{
 public double Z;   
 
 public Punkt3D () {
   x = 0;  
   y = 0;
 }
 public Punkt3D (double x ,double y)
 {
     this.x = x;
     this.y = y;
     this.Z = Z;
     
 }

    Punkt3D(double X, double Y, double Z) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
 public void Losowanie()
{
   Random rand = new Random ();
   x = (-10) + (10 -(-10)) * rand.nextDouble();
    y = (-10) + (10 -(-10)) * rand.nextDouble();
     Z = (-10) + (10 -(-10)) * rand.nextDouble();
}
   @Override

    public String toString(){

        return "Wspolrzedne punktu 3D: " + Double.toString(x) + " x " + Double.toString(y) + " x " + Double.toString(Z);

    }
}
