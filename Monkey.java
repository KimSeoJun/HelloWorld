package com.test.quiz3;

public class Monkey extends Animal{
		public Monkey(int agg){
			super(); //상위 클래스의 생성자  , 하위는 this = Monkey
			//부모에서 초기화한 생성자를 불러온것. = Animal()
			this.feed =1;
			this.strength = 
						this.weight = 310;
			this.skin = 1;
			this.speed = 65;
			this.life= 26; 
			this.age = agg;
		}
		@Override
		boolean eat(Animal feed) {
			if(this.alive==true){
			int satiety = feed.weight / 10;  //먹이의 무게를 알아내서 포만감 계산
			this.weight += satiety;   //포만감을 나의 몸무게에 추가시킨다.
			this.strength += satiety *3;
		    return true;
			}
			return false;
		  }
		@Override
		boolean eat(Plant feed){
			return false;
		}
		@Override
		boolean attack(Animal enemy){
			if(this.alive == true && enemy.alive ==true){
			int defence = enemy.weight;
			defence = defence / (enemy.age*100/enemy.life);
			defence += enemy.speed * (Math.random()*10);
			if(enemy.skin ==3) defence += defence*0.2;
			else if (enemy.skin ==4) defence += defence*0.3;
			
			System.out.println("방어력:"+defence);   //debug 코드
			
			int attack = (int)((double)this.weight*(1.2));
			attack += attack*0.3; //int형을 double 형으로 바꿔줌
			if (this.feed == 1) attack += attack*0.3;
			attack += this.speed * (Math.random()*15);
			attack += this.horns * (Math.random()*5);
			if (this.wings > 0) attack *=2;
			
			System.out.println("공격력:"+attack);    //debug 코드
			
			int demage = attack - defence;
			if (demage > 0) {
				enemy.strength -=demage;
				if (enemy.strength < 0) {
					enemy.alive = false;
				}
				return true;
			}
			else if (demage < 0) {
				this.strength += demage;
				if(this.strength < 0 ){
					this.alive = false;
				}
				return false;
			 }
			
		    }
			return false;
		 }
	}

