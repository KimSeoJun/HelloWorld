package com.test.hellowoerld;

import java.util.Scanner;

public class quiz2 {
	 public static void main(String args[]){
		 
		 
		 while(true){
			 System.out.println("���ڸ� �Է��Ͻÿ�");
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
			    System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			 System.out.println("�����Ͻ÷��� y, �ѹ��� �Ͻ÷��� n (y/n)");
			 Scanner scaner = new Scanner(System.in);
			 char ok=scan.next().charAt(0);
			 
			 if(ok=='y'){
				 break;
			 }
			 
			}
	 }
}

