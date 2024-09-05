import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the RANDOMCHOOSE");
        System.out.println("Please, try to choose the number right number");

        Main main = new Main();
        main.menu();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int iterator = 0;

        do {
            System.out.println("Do you want to play the game:");
            System.out.println("1-Start");
            System.out.println("0-Out");

            iterator = scanner.nextByte();

            switch (iterator){
                case 0:
                    System.out.println("Bye");

                    break;

                case 1:
                    this.game();

                    break;

                default:
                    System.out.println("Invalid choice, try again");

                    break;
            }
        } while (iterator != 0);
    }

    public void game() {
        Scanner scanner = new Scanner(System.in);
        int randomValue = new Random().nextInt(100);
        int iteratorGame = 0;

        System.out.println("Do you have 5 attempts");

        for (int rounds = 1; rounds <= 5; rounds++){
            System.out.println("Please, choose a number beetwen 0 - 100");
            System.out.println("This is your " + rounds + " chance");

            iteratorGame = scanner.nextInt();

            if (iteratorGame < randomValue) {
                System.out.println("Your choice is lesser than the random value");
            } else if (iteratorGame > randomValue) {
                System.out.println("Your choice is bigger than random value");
            } else if (iteratorGame == randomValue){
                System.out.println("You win!!!!!!");
                break;
            } else {
                System.out.println("Try again");
            }
        }
    }
}