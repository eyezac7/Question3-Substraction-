package balex.subtraction;

import java.util.Random;
import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number1 = random.nextInt(9) + 1; 
        int number2 = random.nextInt(9) + 1; 

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.printf("What is %d - %d? ", number1, number2);
        int studentAnswer = scanner.nextInt();

        int correctAnswer = number1 - number2;

        if (studentAnswer == correctAnswer) {
            System.out.println("Congratulations! Your answer is correct.");
        } else {
            System.out.println("Oops! The correct answer is " + correctAnswer);
        }

        scanner.close();
    }
}
