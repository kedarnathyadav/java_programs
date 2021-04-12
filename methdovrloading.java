class Adder{  

//Method Overloading: changing no. of arguments

	static int add(int a,int b){return a+b;}  
	static int add(int a,int b,int c){return a+b+c;}  

// Method Overloading: changing data type of arguments

	static double add(double a, double b){return a+b;}  
}  

// Method Overloading with TypePromotion

class OverloadingCalculation1{  
  void sum(int a,long b){System.out.println(a+b);}  
  void sum(int a,int b,int c){System.out.println(a+b+c);}  
}

//Method Overloading with Type Promotion if matching found

	class OverloadingCalculation2{  
  	void sum(int a,int b){System.out.println("int arg method invoked");}  
  	void sum(long a,long b){System.out.println("long arg method invoked");}  
}

class methdovrloading{  

//Method Overloading: changing no. of arguments

	public static void main(String[] args){  

	System.out.println(Adder.add(11,11));  
	System.out.println(Adder.add(11,11,11)); 

// Method Overloading: changing data type of arguments

	System.out.println(Adder.add(12.3,12.6));  

// Method Overloading with TypePromotion
	OverloadingCalculation1 obj=new OverloadingCalculation1();  
  	obj.sum(20,20);//now second int literal will be promoted to long  
  	obj.sum(20,20,20);   
//Method Overloading with Type Promotion if matching found
	OverloadingCalculation2 obj1=new OverloadingCalculation2();  
  	obj1.sum(20,20);//now int arg sum() method gets invoked  
}}  