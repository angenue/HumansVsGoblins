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
        grid[0][0] = human.toString();
        // Place Goblin at (5, 5)
        grid[5][5] = goblin.toString();
    }

    public String[][] getGrid() {
        return grid;}

    public void setGrid(String[][] grid) {
        this.grid = grid;
    }

    private void fillGrid() {
        for (String[] strings : grid) {
            Arrays.fill(strings, "\uD83C\uDF35");
        }
    }

    private boolean isValidPosition(int x, int y) {
        return x >= 0 && x < grid.length && y < grid[0].length && y >= 0;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(grid).replace("], ", "]\n");
    }
}
