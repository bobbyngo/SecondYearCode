// Ngo Huu Gia Bao
// 101163137

//Compile: javac mydicegame/DiceGame.java
// javac mydicegame/Die.java
//Run: java mydicegame/DiceGame {2 3}     { }: Optional args

//Ex:
//javac mydicegame/DiceGame.java
//javac mydicegame/Die.java
//java mydicegame/DiceGame 2 3 or java mydicegame/DiceGame

package mydicegame;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class DiceGame {

    private int numberOfDice;
    private int numberOfSides;
    private int botBalance;
    private int playerBalance;
    private int playerPoint;
    private int botPoint;
    private int[] botDice;
    private int[] playerDice;
    private Die die;


    /**
     *Constructor of the DiceGame class
     *@param numberOfSides, int, the number of Sides
     *@param numberOfDice, int, the number of Dice
     **/
    public DiceGame(int numberOfDice, int numberOfSides){
        this.numberOfDice = numberOfDice;
        this.numberOfSides = numberOfSides;
        this.playerBalance = 100;
        this.botBalance = 100;
        this.botDice = new int[numberOfDice];
        this.playerDice = new int[numberOfDice];
        this.die = new Die(numberOfSides);
        this.playerPoint = 0;
        this.botPoint = 0;
    }

    /**
     *Default constructor of the Dice class
     **/
    public DiceGame() {
        this(2, 6);
    }

    /**
     *This method will call the roll method and put the int value to the playerDice and getBotDice
     *After that it will add all the values to provide the total point
     **/
    private void play() {
      for (int i = 0; i < playerDice.length; i++) {
        playerDice[i] = die.roll();

        //Do we need to make another for loop?
        botDice[i] = die.roll();
      }

      for (int i = 0; i < playerDice.length; i++) {
        playerPoint += playerDice[i];
        botPoint += botDice[i];
      }
      //System.out.println(playerPoint);
      //System.out.println(botPoint);
    }

    /**
     *Get method of the numberOfSides
     *@return numberOfSides, int, the number of Sides
     **/
    public int getNumberOfSides() {
      return numberOfSides;
    }

    /**
     *Get method of the numberOfDice
     *@return numberOfDice, int, the number of Dice
     **/
    public int getNumberOfDice() {
      return numberOfDice;
    }

    /**
     *Get method of the playerPoint
     *@return playerPoint, int, the point of the user
     **/
    public int getPlayerPoint() {
      return playerPoint;
    }

    /**
     *Get method of the botPoint
     *@return botPoint, int, the point of the bot
     **/
    public int getBotPoint() {
      return botPoint;
    }

    /**
     *Get method of the playerBalance
     *@return playerBalance, int, the balance of the user
     **/
    public int getPlayerBalance() {
      return playerBalance;
    }

    /**
     *Set method of the playerBalance
     *@param playerBalance, int, the new balance of the user
     **/
    public void setPlayerBalance(int newPlayerBalance) {
      this.playerBalance = newPlayerBalance;
    }

    /**
     *Get method of the botBalance
     *@return botBalance, int, the balance of the bot
     **/
    public int getBotBalance() {
      return botBalance;
    }

    /**
     *Set method of the botBalance
     *@param botBalance, int, the new balance of the bot
     **/
    public void setBotBalance(int newBotBalance) {
      this.botBalance = newBotBalance;
    }

    /**
     *Get method of the botDice
     *@return botDice, arrays type int, the values rolled by the bot
     **/
    public int[] getBotDice() {
      return botDice;
    }

    /**
     *Get method of the playerDice
     *@return playerDice, arrays type int, the values rolled by the player
     **/
    public int[] getPlayerDice() {
      return playerDice;
    }

    public static void main(String[] args) {

        if (args.length != 2 && args.length != 0) {
            System.out.println("Invalid input");
            System.exit(1);
        }
        DiceGame dicegame = new DiceGame();
        try {
          if (args.length == 2){
          dicegame = new DiceGame(Integer.parseInt(args[1]), Integer.parseInt(args[0]));
          }
        }catch (Exception e) {
          System.out.println("Invalid input");
          System.exit(1);
        }

        System.out.println("Welcome to the Game of Dice!");
        System.out.println("Starting a game with " + dicegame.getNumberOfDice() + " " + dicegame.getNumberOfSides() + "-sided dice");
        Scanner myObj = new Scanner(System.in);
        while (dicegame.getPlayerBalance() != 0 && dicegame.getBotBalance() != 0) {

            System.out.println("------------------------------------");
            System.out.println("You have $" + dicegame.getPlayerBalance());
            System.out.println("The computer has $" + dicegame.getBotBalance());
            System.out.println("PLace your bet (-1 to quit playing) >>>");
            Integer bet = 0;
            try{
              bet = myObj.nextInt();

            }catch (Exception e) {
              System.out.println(e);
              System.exit(1);
            }


            if (bet == -1){
              break;
            }
            else if (bet > dicegame.getPlayerBalance() || bet <= 0){
              System.out.println("You have to bet a positive value, but less than your remaining money!");
            }
            else {
              dicegame.play();
              System.out.print(dicegame.getNumberOfDice() + "Dice :: You rolled > {");
              for (int i = 0; i < dicegame.getPlayerDice().length; i ++) {
                  System.out.print(" " + dicegame.getPlayerDice()[i] + " ");
              }
              System.out.print("}\n");

              System.out.print(dicegame.getNumberOfDice() + "Dice :: Comp rolled > {");
              for (int i = 0; i < dicegame.getBotDice().length; i ++) {
                  System.out.print(" " + dicegame.getBotDice()[i] + " ");
              }
              System.out.print("}\n");


              if (dicegame.getBotPoint() > dicegame.getPlayerPoint()){

                if (bet > dicegame.getBotBalance() || bet == dicegame.getPlayerBalance()){
                  bet = Math.min(dicegame.getBotBalance(), dicegame.getPlayerBalance());
                }
                dicegame.setPlayerBalance(dicegame.getPlayerBalance() - bet);
                dicegame.setBotBalance(dicegame.getBotBalance() + bet);

                System.out.println("The computer wins this round!");
              }
              else if (dicegame.getBotPoint() < dicegame.getPlayerPoint()) {

                //Not done
                //bet = dicegame.getBotPoint();
                if (bet > dicegame.getBotBalance() || bet == dicegame.getPlayerBalance()){
                  bet = Math.min(dicegame.getBotBalance(), dicegame.getPlayerBalance());
                }
                dicegame.setPlayerBalance(dicegame.getPlayerBalance() + bet);
                dicegame.setBotBalance(dicegame.getBotBalance() - bet);

                System.out.println("You wins this round!");
              }else {
                System.out.println("Your point and computer are the same");
              }
            }
            if(dicegame.getPlayerBalance() == 0) {
                System.out.println("Oh no, you're out of credit!");
            }
            else if (dicegame.getBotBalance() ==0) {
                System.out.println("The computer's out of credit! You won");
            }
          }

          System.out.println("Good Bye!");
      }
}
