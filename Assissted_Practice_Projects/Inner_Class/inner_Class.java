package Assignment;

public class inner_Class {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		inner_Class obj=new inner_Class();
		inner_Class.Inner in=obj.new Inner();  
		in.hello();  
	}
}

