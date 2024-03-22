package main.java.org.example;

import main.java.org.example.Entities.Land;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Land world = new Land();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(world);
            System.out.println(" ");
            System.out.println("Enter a WASD key to move or 'q' to quit: ");
            char direction = scanner.next().charAt(0);
            direction = Character.toLowerCase(direction);

            if (direction == 'q') {
                System.out.println("Exiting the game. Goodbye!");
                break;
            }

            if (direction != 'w' && direction != 'a' && direction != 's' && direction != 'd') {
                System.out.println("Invalid input. Please enter 'w', 'a', 's', 'd', or 'q' to move or quit.");
                continue; // Ask the user to try again
            }

            // Move the human
            world.move(direction);
        }
        scanner.close();

    }
}