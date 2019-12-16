package javaclass1;

public class Encapsulation {
	
	private String name;
	private int age;
	private int loan;
	
	public void setname(String name) {
		this.name=name;//this is used to get private values to method
	}
	public void setage(int age) {
		if(age>=18 && age<=60) {
		this.age=age;
		}
		else {
			System.out.println("Invalid age: "+getage());
		}
	}
	public void setloan(int loan) {
		if(loan>=1000 && loan<=60000) {
		this.loan=loan;
	}
		else {
			System.out.println("Invalid Loan Amount");
		}
	}
	
	public String getname() {//if using datatype instead of void we have to return a value
		return name;
	}
	public int getage() {
		return age;
	}
	public int getloan() {
		return loan;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
