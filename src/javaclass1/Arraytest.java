package javaclass1;

public class Arraytest {

	public static void main(String[] args) {
		
		/*int i[]= {1,2,3,4,5};
		//int j[5];
		int j[]= new int [5];
		j[0]=30;
		j[1]=25;
		j[2]=20;
		j[3]=15;
		j[4]=10;
		String sa[]= {"abc","def","ads","you","ghi"};
		for(int a=0;a<sa.length;a++) {
			System.out.println(sa[a]);
		}*/
		
//Mutli dimentional array
		
		int md[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int x=0;x<3;x++) {
			for(int z=0;z<3;z++) {
				System.out.println(md[x][z]+" ");
			}
			System.out.println();
		}
		
}

	}
