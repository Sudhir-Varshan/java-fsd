package Assignment;

public class accessSpecifiers4 {

	public static void main(String[] args) {
		//protected
		System.out.println("Public Access Specifier");
		publicAccessSpecifiers obj = new publicAccessSpecifiers (); 
		//trying to access protected method of another class 
	    obj.display();  
	}

}
