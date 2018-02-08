/*Maurice Hanns CSC 242 02-08-2018
public Card (int Num, String ST){
			
			Number = Num;
			suit = ST;*/

import java.util.Scanner;
import java.util.Random;

public class CartTest {
	
	public static void main(String [] args){

	//1st Type Hearts Class
	Card Card1T1 = new Card (1, "Hearts"); //1st Type
	Card Card2T1 = new Card (4, "Hearts"); //1st Type
	Card Card3T1 = new Card (7, "Hearts"); //1st Type
	
	//1st Type Diamond Class
	Card Card1T2 = new Card (2, "Diamonds"); //2nd Type
	//Card Card2T2 = new Card (5, "Diamonds"); //2nd Type
	Card Card3T2 = new Card (8, "Diamonds"); //2nd Type

	//1st Type Spade Class	
	Card Card1T3 = new Card (3, "Spade"); //3rd Type
	Card Card2T3 = new Card (6, "Spade"); //3rd Type
	Card Card3T3 = new Card (9, "Spade"); //3rd Type
	
	//1st Type Lucky Class
	Card Card2T2 = new Card (5, "Clover"); //Lucky Type

	
	Random rand = new Random();
	int randVar  = (rand.nextInt(9) + 1);

	if (randVar == 1){
		System.out.println(Card1T1.suit);
		System.out.println(randVar);
	}
	else 	if (randVar == 2){
		System.out.println(Card1T2.suit);
		System.out.println(randVar);
	}
	else 	if (randVar == 3){
		System.out.println(Card1T3.suit);
		System.out.println(randVar);
	}
	else 	if (randVar == 4){
		System.out.println(Card2T1.suit);
		System.out.println(randVar);
	}
	else 	if (randVar == 5){
		System.out.println(Card2T2.suit);
		System.out.println(randVar + " This is the lucky Card!!!");
		
	}
	else 	if (randVar == 6){
		System.out.println(Card2T3.suit);
		System.out.println(randVar);
	}
	else 	if (randVar == 7){
		System.out.println(Card3T1.suit);
		System.out.println(randVar);
	}
	else 	if (randVar == 8){
		System.out.println(Card3T2.suit);
		System.out.println(randVar);
	}
	else 	if (randVar == 9){
		System.out.println(Card3T3.suit);
		System.out.println(randVar);
	}
	
	
	}
}
