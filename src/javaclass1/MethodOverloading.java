package javaclass1;

public class MethodOverloading {

	public static int addd(int a,int b) {
		return(a+b);
		
	}
	public static int addd(int a,int b,int c) {//this is method overloading by without changing 
		//the method name by changing or adding the parameters
		return(a+b+c);
		
	}
	public static double addd(double a,double b,double c, double d) {
		return(a+b+c+d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addd(11,11));
		System.out.println(addd(22,22,22));
		System.out.println(addd(11.737474772,22.12343254,33.4354654654,44.87893864267));
	}

}
