package javaclass1;

public class Constructor {
	int rollno;
	String name;	
	public Constructor() {// This is constructor
		
		System.out.println("I am Constructor");
		System.out.println("I am Used");
	}
public Constructor(int a , String s) { //This is called as paramater raising
	
	rollno=a;
	name=s;	
}
	
public void display() {
	
	System.out.println("Rollno is :"+rollno+" name is :"+name);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor con = new Constructor();
		//System.out.println(con.rollno);
		Constructor con1 = new Constructor(1,"Rama");
		Constructor con2 = new Constructor(20,"Sita");
		con1.display();
		con2.display();
		
	}

}
