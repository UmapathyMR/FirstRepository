package com.iciciloan.carloans;

public class DataTypes {

	
	//integer data types
	
	//all integer data types default value is 0
	byte b = 127;//1 byte
	short s = 12;//2 byte
	int i = 100;//4 byte
	long l =  100;///8 byte
	
	//floating data types

	
	float ff =  12.5f;// 4 types //default value is 0.0
	double d = 23.23;// 8 bytes // default value is 0.0
	
	//non numeric data type
	char c = 'U';//2 bytes//default value is a space
	boolean bb = true;//default value is False
	
	//string data type
	
	String str1 = "Umapathy";//default value is NULL
	
	static String str;
	static float roi;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 100;// we cannot have it as int x; here the data type is called int.. ie integer data type
		
		char c = 'c';// here the data type is called primitive character data type . ie character (Char) data type
		
		//so, within the static method if we want to call all the above instance variable, then we call them using
		//the class object variable like as follows:
		
		DataTypes obj = new DataTypes();
		System.out.println("byte" + "  " + obj.b);
		System.out.println("short" + "  " + obj.s);
		System.out.println("int"+ "  "  + obj.i);
		System.out.println("long"+ "  "  + obj.l);
		System.out.println("float"+ "  "  + obj.ff);
		System.out.println("boolean"+ "  "  + obj.bb);
		System.out.println("str1"+ "  "  + obj.str1);
		System.out.println("int"+ "  "  + x);//calling local variable within the same main method
		System.out.println("str"+ "  "  + str);
		System.out.println("roi"+ "  "  + roi);
		
		//in all the above instance variable types declared in the current class....we have instantiated some values to that
		//variables... like int x =100, if we are not giving (not instantiating) any values and declaring it as int x; , then usually what 
		//is that, every instance data type will have its own default value.. example, int default value is zero
	
		//if there are some local variable created within the static main method, then strictly we have to instantiate 
		//some value to it and we cannot leave it without declaring values.. but we can leave it without declaring the values outside 
		//method only and then if we call them in the main method, it will print the default value..
		
	}

}
