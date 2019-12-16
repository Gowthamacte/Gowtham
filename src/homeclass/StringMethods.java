package homeclass;

public class StringMethods {

	public static void main(String[] args) {
		//Substring method:
		/*String s="Gowtham";
		String s1=s.substring(0,3);*/
		String s2="Virat";
		String s3=" Kholi";
		String s4="Virat";
		String s5="KHOLI";
		//System.out.println(s1);
		System.out.println(s2.equals(s4));//equals by using equals() method
		System.out.println(s2==s3);//equals by using operator
		System.out.println(s3.equalsIgnoreCase(s5));//equals by using equalsingnorecase() method which ignore case sensitive
		System.out.println(s2.compareTo(s4));
		//System.out.println(s3.compareTo(s2));
			System.out.println("---------------------------------------------------------------");
		String s6= s2+s3;
		System.out.println(s6);//Concate by using + operator
		String s7= 50+50+"Hundred"+50+50;
		System.out.println(s7);//Before string it will add the values but after string declaration interger values are treated as string
		System.out.println(s2.concat(s3));//Concate using concat() method
		System.out.println("------------------------------------------------------------------");
		System.out.println(s2.toUpperCase());//Converting string to upper case using touppercase() method
	}

}
