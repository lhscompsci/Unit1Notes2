import java.util.Scanner;

public class LearningInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your value for Pi");
        double myPiVal = keyboard.nextDouble();

        //clearing the buffer
        keyboard.nextLine();

        System.out.println("What's your name?");
        String name = keyboard.nextLine();

        System.out.println("How old are you?");
        int age = keyboard.nextInt();

        System.out.println("Your name is "+ name);
        System.out.println("You are "+ age + " years old");


    }

}
