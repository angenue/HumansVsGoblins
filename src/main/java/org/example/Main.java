package main.java.org.example;

import main.java.org.example.Entities.Land;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Land world = new Land();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(world); // Print the current state of the land
            System.out.println("Enter a WASD key to move or 'q' to quit: ");
            char direction = scanner.next().charAt(0); // Read a character input
            direction = Character.toLowerCase(direction);

            if (direction != 'w' && direction != 'a' && direction != 's' && direction != 'd' && direction != 'q') {
                System.out.println("Invalid input. Please enter 'w', 'a', 's', 'd', or 'q' to move or quit.");
                continue; // Ask the user to try again
            }


            // Move the human in the specified direction
            world.move(direction);
        }

    }
}