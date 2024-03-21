package main.java.org.example.Entities;

import java.util.Arrays;

public class Goblins{
    private int x;
    private int y;

    public Goblins() {
        this.x = 5;
        this.y = 5;
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
    public String toString() {
        return "\uD83E\uDDCC";
    }
}
