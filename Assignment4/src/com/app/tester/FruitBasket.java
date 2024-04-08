package com.app.tester;


import java.util.Scanner;
import java.util.Set;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;

enum CaseMenu{
	Exit,Mango,Orange,Apple,AllName,AllDetails,StaleFruit,FreshToStale,SourToStale, repeat
};

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Size Of Basket");
		Fruit [] Basket = new Fruit [sc.nextInt()];
		Fruit f;
		CaseMenu ch;
		int choice;
		int index=0;
        boolean check;
        int index1;
		do {
			System.out.println("0: Exit ");
			System.out.println("1: Add Mango ");
			System.out.println("2: Add Orange ");
			System.out.println("3: Add Apple ");
			System.out.println("4: Display names of all fruits in the basket ");
			System.out.println("5: Display name,color,weight,taste of all fresh fruits,in the basket ");
			System.out.println("6: Display tastes of all stale fruits in the basket ");
			System.out.println("7: Mark a fruit as stale ");
			System.out.println("8: Mark all sour fruits stale ");
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			if(choice>=0 && choice<9) {
				ch=CaseMenu.values()[choice];
				switch(ch) {
				
				case Exit: 
					System.out.println("THANK YOU");
					break;
				case Mango:
					if(index<Basket.length) {
						f= new Mango();
						System.out.println("FRESH OR NOT");
						check=sc.nextBoolean();
						f.setFresh(check);
						Basket[index++]=f;
						
					}
					else {
						System.out.println("BASKET IS FULL");
					}
					break;
				case Orange:
					if(index<Basket.length) {
						f= new Orange();
						System.out.println("FRESH OR NOT");
						check=sc.nextBoolean();
						f.setFresh(check);
						Basket[index++]=f;
						
					}
					else {
						System.out.println("BASKET IS FULL");
					}
					break;
				case Apple:
					if(index<Basket.length) {
						f= new Apple();
						System.out.println("FRESH OR NOT");
						check=sc.nextBoolean();
						f.setFresh(check);
						Basket[index++]=f;
						
					}
					else {
						System.out.println("BASKET IS FULL");
					}
					break;
				case AllName:
					if(index!=0) {
						for (int i=0; i<index;i++) {
							if(Basket[i]==null)
								break;
							System.out.println(Basket[i].getName());
						}
					}else 
						System.out.println("BASKET IS EMPTY");
						break;

				case AllDetails:
					if(index!=0) {
						for (int i =0; i<index;i++) {
							if(Basket[i]==null)
								break;
							System.out.println(Basket[i].toString());
							System.out.println(Basket[i].taste());
							
						}
					}else 
						System.out.println("BASKET IS EMPTY");
						break;	
				case StaleFruit: 	
					if(index!=0) {
						for (int i =0; i<index;i++) {
							if(Basket[i]==null)
								break;
							if(!Basket[i].isFresh())
								System.out.println(Basket[i].taste());
						}
					}else 
						System.out.println("BASKET IS EMPTY");
						break;	
				case FreshToStale:
					System.out.println("ENTER THE INDEX OF THE FRUIT");
					index1= sc.nextInt();
					if (index1<index) {
						Basket[index1].setFresh(false);
						System.out.println("THE FRUIT IS STALE");
					}
					break;
				case SourToStale:
					if(index!=0) {
						for (int i =0; i<index;i++) {
							if(Basket[i]==null)
								break;
							if(Basket[i].taste()=="Sour")
								Basket[i].setFresh(false);
						}
					}else 
						System.out.println("BASKET IS EMPTY");
						break;	
					default: 
						break;
				
				}
			}
			else{
			System.out.println("INVALID CHOICE");
			ch=CaseMenu.repeat;
			}
		}while(ch != CaseMenu.Exit);

	}

}
