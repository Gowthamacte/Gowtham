package javaclass1;

public class Human extends InheritanceTest {
	public static void hum() {
		System.out.println("Human are crying");
		int a=1; int b=2;
		int c=a+b;
		System.out.println("Human adding a and b is:" +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Human hm= new Human();
hm.Dog();
System.out.println("------------------------");
hm.hum();
	}

}
