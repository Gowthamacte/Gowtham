package javaclass1;

public class EncpCall extends Encapsulation {

	public static void main(String[] args) {
		EncpCall ecp = new EncpCall();
		ecp.setname("Deepak");
		ecp.setage(61);
		ecp.setloan(10000);
		System.out.println(ecp.getname());
		System.out.println(ecp.getage());
		System.out.println(ecp.getloan());
	}

}
