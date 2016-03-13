package me.osama;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by OsamaRao on 12-Mar-16.
 */
public abstract class BaseGrid implements Actionable, ManhattanDistance, Printable {

    private HashSet<Integer> toKeepUnique;
    protected HashMap<Position, Integer> grid = new HashMap<>();
    protected Position zeroPosition;

    public void layGrid() {
        Scanner scanner = new Scanner(System.in);
        toKeepUnique = new HashSet<>();

        for (int x = 2; x > -1; x--) {
            for (int y = 2 ; y > -1 ; y--){
                System.out.print("( " + x + "," + y + " )");

                int toBeAdded = scanner.nextInt();

                if (toKeepUnique.contains(toBeAdded)) {
                    // do not add and ask again
                    System.out.println("Illegal Input, number already in a cell, start again");
                    layGrid();
                    return;
                }

                if (toBeAdded < 0 || toBeAdded > 8) {
                    // do not add and ask again
                    System.out.println("Illegal Input, number not within range 0..8, start again");
                    layGrid();
                    return;
                }

                if (toBeAdded == 0){
                    zeroPosition = new Position(x,y);
                }

                toKeepUnique.add(toBeAdded);
                grid.put( new Position(x, y), toBeAdded);
            }
        }
    }

    @Override
    public void printGrid() {
        System.out.println("---------------");
        for (int x = 2; x > -1; x--) {
            for (int y = 2 ; y > -1 ; y--){
                System.out.print("| " + grid.get(new Position(x, y)) + " |");
            }
            System.out.println();
            System.out.println("---------------");
        }
    }
}
