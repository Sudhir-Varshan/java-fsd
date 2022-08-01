package Assignment;

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class parameterized_Constructor {
public static void main(String[] args) {

	Std std1=new Std(2526789,"Alexis");
	Std std2=new Std(2526780,"Anime");
	std1.display();
	std2.display();
		}
}
