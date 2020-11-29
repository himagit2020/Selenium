package maven;

 public class Demo {
	static String str="Name";
	  
	

	 
	 public static void main(String[] args) 
	 {
		  String str1="abc";
		 
		 System.out.println(str1);
		 test1();	
		// test2();
	 }
	 
	 
	 public static void test1() {
		 String str2="abc";
		 
		 System.out.println(str2);
		 
	
	 
	 //Declare a variable
		 
	//Syntax:  data_type  variable name= value;
		 
	 //Data type
	 
	 boolean flag=true;
	 
	 int i = 13;
	 int g = 2;
	 int f = i+g;
	 double j = 30.99;
	 
	 float k = 2.2f;
	 char ch ='k';
	 String val = " abcd";
	 
	 
	 System.out.println(i); 
	 i++; // i = i+1;
	 
	 i--; // i = i-1;
	 System.out.println(flag +" : " + i +" : " +j+" : " +k+" : " +ch+" : " +val);
	 
	 
	 
//	// Operators
//	 +, -, /, *, %
//	 ==, >, <, <=, >=, != / <>
//	 
//	 ++, --
//	 
//	 &&, ||
	 
	 
	 if(i==g){
		 System.out.println("Both numbers are same");
	 }
	 
	 if(i==g){
		 System.out.println("Both numbers are same");
	 } else {
		 System.out.println("Both numbers are NOT same");
	 }
	 
	 
	 if (i==g){
		 System.out.println("Both numbers are same");
	 }
	 else if(i<g){
		 System.out.println("i is greater than g");
	 }
	 else {
		 System.out.println("i is smaller than g");
	 }
	 
//i=13, g=2
	 
	 
	 while (i<g) {
		 System.out.println("i is smaller than g ----");
		 
	 }
	 
	 do {
		 System.out.println("i is smaller than g ++++");
		 
	 }while(i<g); // f/t
	//int a;
	 
		 for (int a=1; a<=10; a++) {
			 System.out.print(a);
			 System.out.println();
		 }
		 
		 
		 
		 //1, 2, .....9...
	 

	 }

 }
