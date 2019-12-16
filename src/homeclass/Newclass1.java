package homeclass;

public class Newclass1 {
	String s="KMS";
	int i=22;
String g="Gowtham";
	public void km() {
		System.out.println("Distance Covered:");
		System.out.println("-----------------------------------------------------");
		System.out.println("Distance covred today: "+i+" "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int a=500;
int b=200;
int c=100;
System.out.println((a+b)/c);
String d="Calculation:";
System.out.println(d+": "+(a+b)/c); 
int e=a+b;
System.out.println(e);
int f=e/c;
System.out.println(d+f);*/

Newclass1 New = new Newclass1();
New.km();
System.out.println(New.g);
	}

}