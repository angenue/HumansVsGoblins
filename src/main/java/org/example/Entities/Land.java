package main.java.org.example.Entities;

import java.util.Arrays;
import java.util.Random;

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

        human.move(direction);
        goblin.move(direction);

        // Check if the human and goblin collided
        if (human.getX() == goblin.getX() && human.getY() == goblin.getY()) {
            grid[human.getX()][human.getY()] = "\uD83E\uDD4A";
            grid[prevHumanX][prevHumanY] = "\uD83C\uDF35";
            grid[prevGoblinX][prevGoblinY] = "\uD83C\uDF35";
            System.out.println(this);
            initiateCombat();
        }

        if (!isValidPosition(human.getX(), human.getY())) {
            System.out.println("You can't go that way! Try again.");

            human.setX(prevHumanX);
            human.setY(prevHumanY);
        }

        // Update grid with new icons
        grid[prevHumanX][prevHumanY] = "\uD83C\uDF35"; // remove old human position
        grid[prevGoblinX][prevGoblinY] = "\uD83C\uDF35";
        grid[human.getX()][human.getY()] = human.getSymbol(); // Update new human position
        grid[goblin.getX()][goblin.getY()] = goblin.getSymbol();
    }

    private  void initiateCombat() {
        System.out.println("Combat initiated! \n");

        Random random = new Random();
        int humanPower = random.nextInt(10) + 1;
        int goblinPower = random.nextInt(10) + 1;

        System.out.println("Human Strength: " + humanPower);
        System.out.println("Goblin Strength: " + goblinPower);
        System.out.println(" ");

        if (humanPower > goblinPower) {
            System.out.println("You won! You defeated the goblin \uD83C\uDF89 \n");
        } else if (humanPower < goblinPower) {
            System.out.println("The goblin defeated you, sorry \uD83D\uDE14 \n");
        } else {
            System.out.println("It's a tie!\n");
        }

        System.exit(0); //close program
    }


    private boolean isValidPosition(int x, int y) {
        return x >= 0 && x < grid.length && y < grid[0].length && y >= 0;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(grid).replace("], ", "]\n");
    }
}
