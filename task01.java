import java.util.Scanner;
public class task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number=3;
        int guess = -1;
        int count = 0;
        while (guess != number) {


            System.out.print("Guess a number between 0-100 and I will tell you if you are too low, or too high. Good Luck  \n  ");
            guess = scanner.nextInt();
            count++;
            if (guess < number) {
                System.out.println("Too low, please try again");
            }
            else if (guess > number) {
                System.out.println("Too high, please try again");
            }
            else
            {
                System.out.println("Correct, the number was " + number + ". You needed " + count + " times");
            }
        }
    }

}