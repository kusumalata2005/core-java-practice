package com.tka;

public class car {

	static byte gear;
	static short modelYear;
	static int engineCC;
	static long chassisNo ;
	static float mileage ;
	static double price;
	static char fuelType;
	static boolean is_automatic ;
	static String brand ;
	static String model ;

	
	    public static void main(String[] args) {
	    	
	    	System.out.println(gear);
			System.out.println(modelYear);
			System.out.println(engineCC);
			System.out.println(chassisNo);
			System.out.println(mileage);
			System.out.println(price);
			System.out.println(fuelType);
			System.out.println(is_automatic);
			System.out.println(brand);
			System.out.println(model);
	    	

	        byte gear = 6;
	        short modelYear = 2025;
	        int engineCC = 1498;
	        long chassisNo = 9876543210L;
	        float mileage = 18.5f;
	        double price = 850000.50;
	        char fuelType = 'P';
	        boolean isAutomatic = true;
	        String brand = "Toyota";
	        String model = "Fortuner";

	        System.out.println("brand-->" + brand);
	        System.out.println("model-->" + model);
	        System.out.println("gear-->" + gear);
	        System.out.println("modelYear-->" + modelYear);
	        System.out.println("engineCC-->" + engineCC);
	        System.out.println("chassisNo-->" + chassisNo);
	        System.out.println("mileage-->" + mileage);
	        System.out.println("price-->" + price);
	        System.out.println("fuelType-->" + fuelType);
	        System.out.println("isAutomatic-->" + isAutomatic);
	    }
	}

