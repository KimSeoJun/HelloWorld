package com.test.hellowoerld;

public class Singletone {
	   
	private static Singletone single =new Singletone();
	
	public Singletone(){}
	
	public static Singletone getInstance(){
		return single;
	}

//public class Test{
	public static void main(String atgs[]){
		
		//Singletone single1 = new Singletone();
		//Singletone single2 = new Singletone();
		Singletone single1 = Singletone.getInstance();
		Singletone single2 = Singletone.getInstance();
		if (single1 == single2) {
			System.out.println("Same!!!!");
		}
	}
 }
