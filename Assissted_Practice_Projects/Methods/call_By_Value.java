package Assignment;

public class call_By_Value {
	int x=50;
	int operation(int x)
	{
		x=x*100;
		return (x);
	}
	
	public static void main(String[] args) {
		call_By_Value c= new call_By_Value();
		System.out.println("Value before operation:"+c.x+"\n");
		int y=c.operation(45);
		System.out.println("Operation value:"+y+"\n");
		System.out.println("Value after operation:"+c.x+"\n");
	}
}
