package Assignment;

public class accessSpecifiers3 {

	public static void main(String[] args) {
		//protected
		System.out.println("Protected Access Specifier");
		protectedAccessSpecifiers obj = new protectedAccessSpecifiers (); 
		//trying to access protected method of another class 
	    obj.display();  
	}

}
