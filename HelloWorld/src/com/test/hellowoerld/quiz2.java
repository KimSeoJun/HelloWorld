package com.test.hellowoerld;

import java.util.Scanner;

public class quiz2 {
	 public static void main(String args[]){
		 
		 
		 while(true){
			 System.out.println("숫자를 입력하시오");
			 Scanner scan = new Scanner(System.in);
			 int num=scan.nextInt();
			 
			if(num==1){
				 System.out.println("*");
				 System.out.println("**");
				 System.out.println("***");
				 System.out.println("****");
				 System.out.println("*****");
			}
			else if (num==2){
				 System.out.println("    *");
				 System.out.println("   **");
				 System.out.println("  ***");
				 System.out.println(" ****");
				 System.out.println("*****");
			}
			else if (num==3){
			      System.out.println("*****");
				 System.out.println(" ****");
				 System.out.println("  ***");
				 System.out.println("   **");
				 System.out.println("    *");
			}
			else if (num==4){	  	 
			     System.out.println("*****");
				 System.out.println("****");
				 System.out.println("***");
				 System.out.println("**");
				 System.out.println("*");
			}
			else{
			    System.out.println("잘못입력하셨습니다.");
			}
			 System.out.println("종료하시려면 y, 한번더 하시려면 n (y/n)");
			 Scanner scaner = new Scanner(System.in);
			 char ok=scan.next().charAt(0);
			 
			 if(ok=='y'){
				 break;
			 }
			 
			}
	 }
}

