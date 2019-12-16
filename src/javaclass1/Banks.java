package javaclass1;

public class Banks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverriding mor = new Methodoverriding();
		HDFC hd = new HDFC();
		ICICI ic = new ICICI();
		System.out.println("The Interest for ICICI is : "+ic.interestrate());
		System.out.println("The Interest for HDFC is : "+hd.interestrate());
		System.out.println("The Interest for HDFC is : "+mor.interestrate());
		
	}

}
