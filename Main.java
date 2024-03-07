/*
Rampalli Agni Mithra
22070126083
B1
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput();
        int choice;

        do {
            System.out.println("Choose a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Sphere");
            System.out.println("3. Square");
            System.out.println("4. Rectangle");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Stop");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    userInput.Circle();
                    break;
                case 2:
                    userInput.Sphere();
                    break;
                case 3:
                    userInput.Square();
                    break;
                case 4:
                    userInput.Rectangle();
                    break;
                case 5:
                    userInput.Cylinder();
                    break;
                case 6:
                    userInput.Pyramid();
                    break;
                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 7.");
            }

        } while (choice != 7); // Continue the loop until the user chooses to stop.
    }
}
