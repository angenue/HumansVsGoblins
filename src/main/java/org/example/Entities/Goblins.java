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
        int direction = random.nextInt(4); // Random direction: 0 = up, 1 = left, 2 = down, 3 = right
        switch (direction) {
            case 0 -> this.y -= 1; // Move up
            case 1 -> this.x -= 1; // Move left
            case 2 -> this.y += 1; // Move down
            case 3 -> this.x += 1; // Move right
        }
    }

    @Override
    public String toString() {
        return "\uD83E\uDDCC";
    }
}
