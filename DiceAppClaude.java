import java.util.Random;
import java.util.Scanner;

public class DiceAppClaude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        System.out.println("This program rolls the dice a select number of times");

        System.out.print("Number of dice rolls: ");
        int rolls = sc.nextInt();

        System.out.print("How many sides to the dice: ");
        int sides = sc.nextInt();

        if (rolls < 1 || sides < 1) {
            System.out.println("Both values must be at least 1.");
            return;
        }

        System.out.println("These are the dice: ");
        for (int i = 0; i < rolls; i++) {
            System.out.print((rng.nextInt(sides) + 1) + " ");
        }
        System.out.println();
    }
}