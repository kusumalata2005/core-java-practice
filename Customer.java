package com.tka;

public class Customer {
	
	static byte id;
	static short creditscore;
	static int age;
	static long phno;
	static float height;
	static double accountbalance;
	static char gender;
	static boolean is_active;
	static String name;
	
 public static void main(String args[]) {
	 
	System.out.println(id);
	System.out.println(creditscore);
	System.out.println(age);
	System.out.println(phno);
	System.out.println(height);
	System.out.println(accountbalance);
	System.out.println(gender);
	System.out.println(is_active);
	System.out.println(name);
	
	byte id = 5;
	short creditscore = 50;
	int age = 35;
	long phno = 6762357876L;
	float height = 5.7f;
	double accountbalance = 70877;
	char gender = 'f';
	boolean is_active = true;
	String name = "Priya";
	
	
	System.out.println("id-->"+id);
	System.out.println("name-->"+name);
	System.out.println("age-->"+age);
	System.out.println("creditscore-->" +creditscore);
	System.out.println("phno-->" +phno);
	System.out.println("height-->" +height);
	System.out.println("gender-->"+gender);
	System.out.println("is_active-->"+is_active);
	System.out.println("accountbalance-->"+accountbalance);
	
	
}
}