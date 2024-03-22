package main.java.org.example.Entities;

public interface Moveable {
    void move(char direction);
    int getX();
    int getY();
    String getSymbol();
    void setX(int x);
    void setY(int y);
}
