package SnakeAndLadder;
public class SnakeAndLadder{
      public static  void main(String[] args){
      //UC1 - Snake and Ladder game played with single player at start position 0
      int position=0;
      System.out.println("Welcome to Snake and Ladder Game");
      System.out.println("Initial Position is 0");
      RollTheDice();
      }
      public static int RollTheDice() //The Player rolls the dice to get a number between 1 to 6.
      {
		int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);//using Random function to get a number betweem 1 to 6
		System.out.println("Dice rolled and the number is: " + diceNumber);
		return diceNumber;
      }
}