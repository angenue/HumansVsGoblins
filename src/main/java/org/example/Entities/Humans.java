package main.java.org.example.Entities;

import java.util.Arrays;

public class Humans implements Moveable{
    private int x;
    private int y;

    public Humans() {
        this.x = 0;
        this.y = 0;
    }

    // Method to move the human
    public void move(char keyMove) {
        switch (keyMove) {
            case 'w' -> this.y -= 1; // Move up (decrease y-coordinate)
            case 'a' -> this.x -= 1; // Move left (decrease x-coordinate)
            case 's' -> this.y += 1; // Move down (increase y-coordinate)
            case 'd' -> this.x += 1; // Move right (increase x-coordinate)
        }
    }

    @Override
    public String toString() {
        return "\uD83E\uDDD1\u200D\uD83C\uDF3E";
    }
}
