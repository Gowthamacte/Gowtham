package javaclass1;

public class ObjectTest {
String name="Gowtham";
int age=27;
public void human() {
	System.out.println("I am a Human Being");
	System.out.println(name+" "+"It's me");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ObjectTest otob=new ObjectTest();
otob.human();
System.out.println(otob.name);
System.out.println(otob.age);
	}

}
