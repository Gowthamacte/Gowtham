package javaclass1;

public class Dependent2 extends Abstractclass {
	
	public void abc() {
		System.out.println("I am Dependent2");
	}

	public static void main(String[] args) {
		Dependent2 d2= new Dependent2();
		DependentAbstractclass ast= new DependentAbstractclass();//Abstractclass ast= new Abstractclass() not working because Abstract class can't be called directly we have to call in-directly
		ast.abc();
		d2.name();
		d2.abc();
		

	}

}
