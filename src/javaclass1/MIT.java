package javaclass1;

public class MIT implements College {

	public static void main(String[] args) {
	Peoples p=new Peoples();
	MIT m=new MIT();
	p.Student();
	p.Scheme();
	p.Batch();
	p.city();
	System.out.println("----------------------------------");
	m.Student();
	m.Scheme();
	m.Batch();
	m.city();

	}

	public void city() {
		System.out.println("I am from Bangalore");
		
	}

	public void Student() {
		System.out.println("I am MIT student");
		
	}

	public void Scheme() {
		System.out.println("I am Engineering");
		
	}

	public void Batch() {
		System.out.println("I am 3rd year");
		
	}

}
