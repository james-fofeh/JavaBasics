import java.util.Scanner;

public class DiceApp{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("This program rolls the dice a select number of times");
        // Initial questions
        System.out.print("Number of dice rolls: ");
        int rolls = sc.nextInt();

        System.out.print("How many sides to the dice: ");
        int sides = sc.nextInt();

//        Programming dice rolls
        System.out.println("These are the dice: ");
        for (int i = 0; i < rolls; i++){
            String value = (Math.ceil(Math.random()*sides) + "");
            System.out.print(value.substring(0, 1) + " ");
        }

    }
}