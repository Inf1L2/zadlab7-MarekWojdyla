package pl.edu.ur.oopl7;

;

import java.util.Random;


public class Punkt2D {
   public double x;
    public double y;
    
    public Punkt2D(){
        x=0;
        y=0;
       
    }
   
    public Punkt2D(double x , double y)
    {
      this.x=x;
      this.y=y;
    }
    public void MetodaLosujaca()
    {
        Random rand = new Random();
        x =(-10) + (10-(-10)) * rand.nextDouble();
        y =(-10) + (10-(-10)) * rand.nextDouble();
        }
    @Override
    
    public String toString(){
        return "Współrzedne punktu 2D: " +  Double.toString(x) +  " x " + Double.toString(y);
    }

    void randomCO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
    

