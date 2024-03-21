package main.java.org.example.Entities;

import java.util.Arrays;

public class Humans{
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
        return "\uD83E\uDDD1\u200D\uD83C\uDF3E";
    }
}
