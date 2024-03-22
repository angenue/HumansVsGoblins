package main.java.org.example.Entities;

import java.util.Arrays;
import java.util.Random;

public class Goblins implements Moveable {
    private int x;
    private int y;

    public Goblins() {
        this.x = 0;
        this.y = 0;
    }



    // Method to move the human
    @Override
    public void move(char keyMove) {
        Random random = new Random();
        int direction = random.nextInt(4);

        while (true) {
            switch (direction) {
                case 0: // Move up
                    if (y > 0) { // If goblin is not at the top row
                        y--; // Move up
                        return;
                    }
                    break;
                case 1: // Move left
                    if (x > 0) {
                        x--;
                        return;
                    }
                    break;
                case 2: // Move down
                    if (y < 5) { // If goblin is not at the bottom row
                        y++; // Move down
                        return;
                    }
                    break;
                case 3: // Move right
                    if (x < 5) {
                        x++;
                        return;
                    }
                    break;
            }
            // gives new random direction if the current direction would make goblin go out of bounds
            direction = random.nextInt(4);
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String getSymbol() {
        return "\uD83E\uDDDF";

    }

    @Override
    public String toString() {
        return "\uD83E\uDDDF";
    }
}
