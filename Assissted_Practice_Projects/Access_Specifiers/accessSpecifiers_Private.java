package Assignment;

public class accessSpecifiers2 {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		privateAccessSpecifier  obj = new privateAccessSpecifier(); 
        //trying to access private method of another class 
        obj.display();

	}
}
