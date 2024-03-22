package main.java.org.example.Entities;

import java.util.Arrays;

public class Humans implements Moveable{
    private int x;
    private int y;

    public Humans() {
        this.x = 0;
        this.y = 0;
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
        return "\uD83E\uDD3A";
    }

    @Override
    public void move(char direction) {
        switch (direction) {
            case 'w' -> this.y -= 1;
            case 'a' -> this.x -= 1;
            case 's' -> this.y += 1;
            case 'd' -> this.x += 1;
        }
    }
}
