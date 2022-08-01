package Assignment;

public class inner_Class1 {

private String msg="Inner Classes";

void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
 }  
 
 Inner l=new Inner();  
 l.msg();  
}  


public static void main(String[] args) {
	inner_Class1  ob=new inner_Class1 ();  
	ob.display();  
	}
}

