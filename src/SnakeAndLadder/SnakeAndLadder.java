package SnakeAndLadder;
import java.util.*;
import java.util.Scanner;
public class SnakeAndLadder{
      public static  void main(String[] args){
      //create object for class SnakeLadder 
      SnakeAndLadder game = new SnakeAndLadder();
      Scanner sc = new Scanner(System.in);
      //UC1 - Snake and Ladder game played with single player at start position 0
      int position=0;
      System.out.println("Welcome to Snake and Ladder Game");
      System.out.println("Initial Position is 0");
      int numberOfTimesDiceRolled=0;
      while(position<=100)//UC4 - Repeating until the position reaches 100
      {
      int diceNumber=game.RollTheDice();//UC2
      int playNumber=game.checkPlayOption(position, diceNumber);//UC3
      position=position+diceNumber*playNumber;//Calculating the positions
      if(position>100) //UC5 -Ensuring the player gets exact winning position- 100 
      continue;
      if(position<0)
       {
         position=0;      
        } 
      numberOfTimesDiceRolled+=1; //UC6 - Number of  times dice rolled
      }
        System.out.println("Number Of Times Dice Rolled : " + numberOfTimesDiceRolled);
       System.out.println("WON");
      }
      
      private int RollTheDice() //UC2 - The Player rolls the dice to get a number between 1 to 6.
      {
		int Number = (int) (Math.floor(Math.random() * 10) % 6 + 1);//using Random function to get a number betweem 1 to 6
		//System.out.println("Dice rolled and the number is: " + Number);
		return Number;
      }
      
      private int checkPlayOption(int position, int diceNumber)//UC3 -  Check for play option - Options : No Play, Snake, Ladder.
      {
       int play=0;
       int playOption = (int) (Math.floor(Math.random() * 10) % 3);
       switch (playOption) {
                        case 0:
                                System.out.println("Play Option is : " + playOption);
				System.out.println("No play");
                                position += 0;
                                System.out.println("position is " + position);
                                play=0;
				break;
			case 1:
                                System.out.println("Play Option is : " + playOption);
                                System.out.println("Ladder");
                                position += diceNumber;
                                System.out.println("position is " + position);
                                play=1;
				break;
			default:
                                System.out.println("Play Option is : " + playOption);
                                System.out.println("Snake");
                                position -= diceNumber;
                                System.out.println("position is " + position);
                                play=-1;
		}
       return play;
      }
}