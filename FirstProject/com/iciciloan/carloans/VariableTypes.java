package com.iciciloan.carloans;

public class VariableTypes {

	//primitive variable
	int x =100;//instance variable or global instance variable or non static variable
	static String cname = "vmware";//static variable, as it has the keyword static
	static VariableTypes obj;
	
	public void m1() 
	{
	
	int y = 200;//local variable of type primitive type
	System.out.println(y);
	System.out.println(this.x);//this keyword refers to the current class instance variable
	System.out.println(cname);
	
	//if we use the instance variable as X within this method and also declare same X above (in the current class) 
	//the method, then if we want to call the current class instance variable X, then we use the this keyword to call 
	//that particular X defined within the current class instance variable
	
	
	}
	
	public static void m2() {
				
		VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(cname);
		System.out.println(VariableTypes.cname);
	
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
		//System.out.println(obj.y); here obj.y is not possible, as we cannot access local variable outside that method
		System.out.println(VariableTypes.cname);//calling static variable using class name in main method
		System.out.println(cname);//calling static variable directly in the main method
		
	}

		
		//any variable that is declared using the class object reference variable is called the non primitive variable.
		//so, in the above main method, the obj is called the reference variable of that classtype and it is called
		//the non primitive variable
		// here instead of creating two times obj in static m2() and in static main method, we can actually declare it globally
		//outside *********


//public static void m2() {
		
//obj = new VariableTypes();
//System.out.println(obj.x);
//System.out.println(cname);
//System.out.println(VariableTypes.cname);

//}

//public static void main(String[] args) {
// TODO Auto-generated method stub

//obj = new VariableTypes();
//System.out.println(obj.x);
//System.out.println(obj.y); here obj.y is not possible, as we cannot access local variable outside that method
//System.out.println(VariableTypes.cname);//calling static variable using class name in main method
//System.out.println(cname);//calling static variable directly in the main method

//}
		
		public static void m3() {
			
			obj = new VariableTypes();
			System.out.println(obj.x);
			System.out.println(cname);
			System.out.println(VariableTypes.cname);
		
		}
		
			public static void main1(String[] args) {
			// TODO Auto-generated method stub

			obj = new VariableTypes();
			System.out.println(obj.x);
			//System.out.println(obj.y); here obj.y is not possible, as we cannot access local variable outside that method
			System.out.println(VariableTypes.cname);//calling static variable using class name in main method
			System.out.println(cname);//calling static variable directly in the main method
			
		}



}



