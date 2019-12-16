package javaclass1;

public class StringOverloading {

	public static void main(String args) {
		// TODO Auto-generated method stub
System.out.println("This is main with main(string args)");
	}
	
	public static void main() {
		// TODO Auto-generated method stub
System.out.println("This is main with main()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("This is main with main(string[] args)");
main("hello");
main();
	}
}
