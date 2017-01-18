package com.game.wordgame;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] ar) {

		Scanner scan = new Scanner(System.in);
		int menu;
		int flag = 0;
		String ans;
		String re = "y";
		
		String[][] first = new String[2][3];
		first[0][0] = "┌───────────┐";
		first[0][1] = "│육  두  쌍  칸│";
		first[0][2] = "│짜  까  치  곱│";
		first[1][0] = "│창  동  겹  파│";
		first[1][1] = "│자  뽕  면  빨│";
		first[1][2] = "└───────────┘";
		
		String[][] two = new String[2][3];
		two[0][0] = "┌───────────┐";
		two[0][1] = "│장　훈　용　찬│";
		two[0][2] = "│서　희　구　진│";
		two[1][0] = "│다　호　최　유│";
		two[1][1] = "│상　열　준　범│";
		two[1][2] = "└───────────┘";
		
		String[][] three = new String[2][3];
		three[0][0] = "┌───────────┐";
		three[0][1] = "│건　제　검　박 │";
		three[0][2] = "│우　빈　공　부 │";
		three[1][0] = "│유　잔　상　든 │";
		three[1][1] = "│훤　이　만　호 │";
		three[1][2] = "└───────────┘";
		 
		String[][] four = new String[2][3];
		four[0][0] = "┌───────────┐";
		four[0][1] = "│지　원　주　명 │";
		four[0][2] = "│우　수　동　환 │";  
		four[1][0] = "│박　성　연　인 │";
		four[1][1] = "│진　정　이　롱 │";
		four[1][2] = "└───────────┘";
		 
		String[][] five = new String[2][3];
		five[0][0] = "┌───────────┐";
		five[0][1] = "│코　염　슴　치 │";
		five[0][2] = "│호　끼　수　지 │";  
		five[1][0] = "│고　랑　원　린 │";
		five[1][1] = "│가　린　타　문 │";
		five[1][2] = "└───────────┘";
		
		String[] six = new String[6];
		six[0] = "┌───────────┐";
		six[1] = "│마　스　콜　두 │";
		six[2] = "│용　테　고　링 │";  
		six[3] = "│축　역　프　수 │";
		six[4] = "│양　야　말　승 │";
		six[5] = "└───────────┘";
		
		String[] seven = new String[6];
		seven[0] = "┌───────────┐";
		seven[1] = "│이　플　동　에 │";
		seven[2] = "│두　수　성　나 │";  
		seven[3] = "│글　한　케　다 │";
		seven[4] = "│디　레　엘　티 │";
		seven[5] = "└───────────┘";
		
		String[] eight = new String[6];
		eight[0] = "┌───────────┐";
		eight[1] = "│환　티　아　봉 │";
		eight[2] = "│마　콜　운　레 │";  
		eight[3] = "│사　스　밀　다 │";
		eight[4] = "│수　붕　제　비 │";
		eight[5] = "└───────────┘";
		
		while(re.equals("y")){
		System.out.println("┌──────────────────┐");
		System.out.println("│      M E N U     │");
		System.out.println("│ 1.게임시작     	   │");
		System.out.println("│ 2.게임종료  	   │");
		System.out.println("└──────────────────┘");
		menu = scan.nextInt();
		
		
		if (menu == 1) {
  // 1번문제			
			 System.out.println("1번 문제 : 음식");
			for(int n=0; n<2; n++){
				for(int j=0; j<3; j++){
					System.out.println(first[n][j]);	
				}
			}
			
             while (flag < 1) {
				ans = scan.next();
				if (ans.equals("곱창")){
					flag++;
				}
				else{
					System.out.println("틀렸습니다. 정답을 입력하세요.");
				}
			}
   //2번문제	
			flag = 0;
			
			 System.out.println("2번 문제 : 우리반 사람들 중에 한명");
				for(int n=0; n<2; n++){
					for(int j=0; j<3; j++){
						System.out.println(two[n][j]);	
					}
				}
				
			while (flag < 1) {
				ans = scan.next();
				if (ans.equals("유희상")){
					flag++;
				}
				else{
					System.out.println("틀렸습니다. 정답을 입력하세요.");
				}
			}
   //3번문제	
			flag = 0;
			
			System.out.println("3번 문제 : 연애인");
				for(int n=0; n<2; n++){
					for(int j=0; j<3; j++){
						System.out.println(three[n][j]);	
					}
				}
				
				
			while (flag < 1) {
				ans = scan.next();
				if (ans.equals("공유")){
					flag++;
				}
				else{
					System.out.println("틀렸습니다. 정답을 입력하세요.");
				}
			}
    //4번문제		
			flag = 0;
		
			System.out.println("4번 문제 : 우리반 사람들 중에 한명");
				for(int n=0; n<2; n++){
					for(int j=0; j<3; j++){
						System.out.println(four[n][j]);	
					}
				}
			while (flag < 1) {
				ans = scan.next();
				if (ans.equals("이명우")){
					flag++;
				}
				else{
					System.out.println("틀렸습니다. 정답을 입력하세요.");
				}
			}
			flag = 0;
   //5번문제		 
			System.out.println("5번 문제 : 동물");
				for(int n=0; n<2; n++){
					for(int j=0; j<3; j++){
						System.out.println(five[n][j]);
					}
			  }
			while (flag < 1) {
				ans = scan.next();
				if (ans.equals("치타")){
					flag++;
				}
				else{
					System.out.println("틀렸습니다. 정답을 입력하세요.");
				}
			}
			
// 2x2 사용했었음...구지,,
// 배열 한개만 사용.
	
	//6번 문제		
			flag = 0;
			
			System.out.println("6번 문제 : 스포츠");
			for(int n=0; n<6; n++){
					System.out.println(six[n]);
				}
		  
			while (flag < 1) {
				ans = scan.next();
				if (ans.equals("승마")){
					flag++;
				}
				else{
					System.out.println("틀렸습니다. 정답을 입력하세요.");
				}
			}
	//7번 문제		
			flag = 0;
			
			System.out.println("7번 문제 : 기업");
			for(int n=0; n<6; n++){
					System.out.println(seven[n]);
				}
			
			while (flag < 1) {
				ans = scan.next();
				if (ans.equals("케이티")){
					flag++;
				}
				else{
					System.out.println("틀렸습니다. 정답을 입력하세요.");
				}
			}
	 //8번 문제	
			flag = 0;
			
			System.out.println("8번 문제 : 음료");
			for(int n=0; n<6; n++){
					System.out.println(eight[n]);
				}
			
			while (flag < 1) {
				ans = scan.next();
				if (ans.equals("제티")){
					flag++;
				}
				else{
					System.out.println("틀렸습니다. 정답을 입력하세요.");
				}
			}			
			System.out.println("한번더 하시겠습니까?(y/n)");
			re=scan.next();
			if(re.equals("n")){
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("★축하합니다. 게임을 종료합니다.☆");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			break;
		   }
		}
		 else if (menu == 2) {
			System.out.println("게임을 종료합니다.");
		}else {
			System.out.println("잘못 입력했습니다. 게임을 종료합니다.");
		}
	  }
     }	
  }
