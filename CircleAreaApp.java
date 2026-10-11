import java.util.Scanner;

public class CircleAreaApp{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Welcome to the circle area calculator.");
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
//        Calculate area
        double area = Math.PI*radius*radius;

//        Output area
        System.out.println("The area is: " + area);

    }
}