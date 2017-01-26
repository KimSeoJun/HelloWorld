package com.test.quiz3;

public class AnimalExam {

	public static void main(String[] args) {
		Animal tiger1 = new Animal();
		tiger1.feed =1;
		tiger1.strength = tiger1.weight = 310;
		tiger1.skin = 1;
		tiger1.speed = 65;
		tiger1.life= 26; tiger1.age = 2;
		
		Monkey tiger2 =new Monkey(2);
		
		//tiger1.smoking();
		tiger2.smoking();
		
		Animal tiger3 = tiger2;
		//tiger.smoking();
		Monkey tiger4 = (Monkey)tiger3;
		tiger4.smoking();
		
		System.out.println(tiger1 instanceof Animal); //포함한다
		System.out.println(tiger1 instanceof Monkey); //부모에는 자식이 포함 되어있지않다.
		System.out.println(tiger2 instanceof Animal);//자식에는 부모가 포함되어있다.
		System.out.println(tiger2 instanceof Monkey);//자기자신 당연히 포함.
		System.out.println(tiger3 instanceof Animal);//포함
		System.out.println(tiger3 instanceof Monkey);//부모의 그릇에 더큰 자시의 인스턴스가 들어온것,가능
		System.out.println(tiger4 instanceof Animal);//자식에 부모를 강제 형식을 바꿔서 넣어줌 
		System.out.println(tiger4 instanceof Monkey);//숨어있던 자식의 일부분을 형식을 바꿔서 살려서 넣어줌 자식의 그릇에.
		
		
		///////////////////////////////////////////////
		
		System.out.println(tiger1.attack(tiger2));
		System.out.println(tiger2.strength);
		System.out.println(tiger2.attack(tiger1));
		System.out.println(tiger1.strength);
		System.out.println("-----------------------");
		System.out.println(tiger2.attack(tiger1));
		System.out.println(tiger1.strength);
		System.out.println(tiger1.attack(tiger2));
		System.out.println(tiger2.strength);
		
		
		
		
		
		
		
		
		
		
		
		
	/////////////////////////////////////////	
		
		
		
		Animal tiger = new Animal();
		Animal cow = new Animal();
		tiger.feed = 1; cow.feed =2;
		System.out.println(tiger.eat(cow));
		System.out.println(cow.eat(tiger));
		Plant carret = new Plant();
		System.out.println(tiger.eat(carret));
		System.out.println(cow.eat(carret));
		////////////////////////////////////
		Animal dog= new Animal();
		dog.strength = dog.weight = 27;
		dog.skin =1;
		dog.speed =6;
		dog.life =15; dog.age = 8;
		dog.feed = 3;
		Animal cat = new Animal();
		
		tiger.strength = tiger.weight = 310;
		tiger.skin = 1;
		tiger.speed = 65;
		tiger.life= 26; tiger.age = 2;
		
		System.out.println(dog.attack(tiger));
		System.out.println(dog.strength);
		
		Animal bear = new Animal();
		bear.strength = bear.weight = 600;
		bear.skin =1;
		bear.speed =40;
		bear.life = 20; bear.age = 3;
		bear.feed = 3; 
		
		System.out.println(tiger.attack(bear));
		System.out.println(bear.strength);
		System.out.println(bear.attack(tiger));
		System.out.println(tiger.strength);
		}
}
