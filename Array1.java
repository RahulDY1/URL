package JavaPackage;

public class Array1 {

	public static void main(String[] args) {
	
	//instantiation of an array
		int a[] = new int[5];
		
		//to print the default vaule
	 for (int i = 0; i < a.length ; i++) {
		 System.out.println(a[i]);
	 }
	
	 //defining the array
	 a[0] = 14;
	 a[1] = 18;
	 a[2] = 1;
	 a[3] = 9;
	 a[4] = 4;
	 
	 System.out.println(a[2]);
	 System.out.println(a[0]);
	 
	 //length of array
	 System.out.println(a.length);
	
	 //print all the array
	 for ( int i = 0; i < a.length; i++) {
		 
		 System.out.println(a[i]);
	 }

	}

}
