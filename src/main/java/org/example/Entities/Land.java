package main.java.org.example.Entities;

import java.util.Arrays;

public class Land {
    private String[][] grid;
    private Humans human;
    private Goblins goblin;

    public Land() {
        this.grid = new String[6][6];
        fillGrid();
        human = new Humans();
        goblin = new Goblins();
        // Place Human at (0, 0)
        grid[0][0] = "H";
        // Place Goblin at (5, 5)
        grid[5][5] = "G";
    }

    public String[][] getGrid() {
        return grid;
    }

    public void setGrid(String[][] grid) {
        this.grid = grid;
    }

    private void fillGrid() {
        for (String[] strings : grid) {
            Arrays.fill(strings, "\uD83C\uDF34");
        }
    }

    @Override
    public String toString() {
        return Arrays.deepToString(grid).replace("], ", "]\n");
    }
}
