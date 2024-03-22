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
        int prevHumanX = human.getX();
        int prevHumanY = human.getY();
        int prevGoblinX = goblin.getX();
        int prevGoblinY = goblin.getY();

        // Move the entities
        human.move(direction);
        goblin.move(direction);

        // Check if the new position for the human is valid
        if (!isValidPosition(human.getX(), human.getY())) {
            System.out.println("You can't go that way! Try again.");
            // Reset the human's position to the previous position
            human.setX(prevHumanX);
            human.setY(prevHumanY);
        }

        // Update the grid with the new positions
        grid[prevHumanX][prevHumanY] = "\uD83C\uDF35"; // Clear previous human position
        grid[prevGoblinX][prevGoblinY] = "\uD83C\uDF35"; // Clear previous goblin position
        grid[human.getX()][human.getY()] = human.getSymbol(); // Update human's new position
        grid[goblin.getX()][goblin.getY()] = goblin.getSymbol(); // Update goblin's new position
    }


    private boolean isValidPosition(int x, int y) {
        return x >= 0 && x < grid.length && y < grid[0].length && y >= 0;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(grid).replace("], ", "]\n");
    }
}
