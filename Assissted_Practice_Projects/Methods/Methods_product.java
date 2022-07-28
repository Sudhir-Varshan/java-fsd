package Assignment;

public class Methods_product{
	
	public
		float multiplication(float a, int b)
		{
			float c= a * b;
			return c;
		}

	
	public static void main(String[] args) {
		Methods_product mul= new Methods_product();
		float x=mul.multiplication(10,67);
		System.out.println(x);
	}
}
