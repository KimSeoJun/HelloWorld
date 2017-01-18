package com.test.hellowoerld;

import java.util.Scanner;

public class Good {
		public static void main(String[] args) {
		
		String me;
		int num;
		int computer;
		String com;
		String re;
		
		Scanner scan = new Scanner(System.in);
		
			while(true){
			System.out.println("가위,바위,보!\n당신: ");
			me = scan.nextLine();
		
		
			if(me.equals("가위")) num=0;
			else if (me.equals("바위")) num=1;
			else num=2;
		    
			computer = (int)(Math.random()*3);
			if(computer==0) com="가위";
			else if(computer==1) com="바위";
			else com="보";
			
			System.out.println("컴터: "+com);
			
			if(num==computer){
				System.out.println("비겼습니다.");
			}
			if((num==0 && computer== 1)||num==1 && computer== 2||num==2 && computer== 0){
				System.out.println("컴퓨터한테 졌습니다.");
			}
			if((num==1 && computer== 0)||num==2 && computer== 1||num==0 && computer== 2){
				System.out.println("당신이 이겼습니다.");
			}
			System.out.println("한판더?? (y,n)");
			re = scan.nextLine();
			 if(re.equals("n")) {
				break;
			}
		 }
		}
		
	}
