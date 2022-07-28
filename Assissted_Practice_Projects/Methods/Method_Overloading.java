package Assignment;

public class Method_Overloading {
	
public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(float r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public void area(double x) 
    {
         System.out.println("Area of Square : "+(x*x));
    }
    
    public static void main(String args[])
   {

       Method_Overloading ob=new Method_Overloading();
       ob.area(5,19);
       ob.area(5.8);  
       ob.area(7.9);
   }
}
