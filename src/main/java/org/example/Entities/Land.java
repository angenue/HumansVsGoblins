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
        grid[0][0] = human.getSymbol();
        // Place Goblin at (5, 5)
        grid[5][5] = goblin.getSymbol();
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

    public void move(char direction) {
        human.move(direction);
        goblin.move(direction);

        moveEntity(human);
        moveEntity(goblin);
    }

    public void moveEntity(Moveable entity) {
        int currentX = entity.getX();
        int currentY = entity.getY();


        if (!isValidPosition(currentX, currentY)) {
            System.out.println("You can't go that way! Try again.");
            return;
        }

        if (entity instanceof Humans) {
            grid[currentX][currentY] = entity.getSymbol();
        } else if (entity instanceof Goblins) {
            grid[currentX][currentY] = entity.getSymbol();
        } else {
            // Handle other types of entities (e.g., trees)
            // Set the symbol for trees
            grid[currentX][currentY] = "\uD83C\uDF32"; // Change to the appropriate tree symbol
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
