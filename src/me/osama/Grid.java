package me.osama;

import java.util.HashMap;

/**
 * Created by Osama Rao on 12-Mar-16.
 */
public class Grid extends BaseGrid {

    public Grid(Grid another) {
        this.zeroPosition = another.zeroPosition;
        this.grid = another.grid;
    }

    @Override
    public Grid applyAction(Action action) {
        int newX = 0;
        int newY = 0;
        switch (action) {
            case UP:
                // add 1 to x
                // calculate new position
                newX = zeroPosition.getX() + 1;
                if (isLegalMove(newX)) {
                    return null; // invalid move
                } else {
                    Grid grid = new Grid(this);
                    swapZero(grid, new Position(newX, zeroPosition.getY()));
                    return grid;
                }
            case DOWN:
                // subtract 1 from x
                // calculate new position
                newX = zeroPosition.getX() - 1;
                if (isLegalMove(newX)) {
                    return null; // invalid move
                } else {
                    Grid grid = new Grid(this);
                    swapZero(grid, new Position(newX, zeroPosition.getY()));
                    return grid;
                }
            case RIGHT:
                newY = zeroPosition.getY() + 1;
                if (isLegalMove(newY)) {
                    return null; // invalid move
                } else {
                    Grid grid = new Grid(this);
                    swapZero(grid, new Position(zeroPosition.getX(), newY));
                    return grid;
                }
            case LEFT:
                newY = zeroPosition.getY() - 1;
                if (isLegalMove(newY)) {
                    return null; // invalid move
                } else {
                    Grid grid = new Grid(this);
                    swapZero(grid, new Position(zeroPosition.getX(), newY));
                    return grid;
                }
            default:
                return null;
        }
    }

    private boolean isLegalMove(int value) {
        return value <= 2 || value >= 0;
    }

    private void swapZero(Grid grid, Position toPosition) {
        Integer tileAtToPosition = grid.grid.get(toPosition);
        grid.grid.put(toPosition, grid.grid.get(zeroPosition));
        grid.grid.put(zeroPosition, tileAtToPosition);
    }


    @Override
    public int manhattanDistance() {
        int manhattanDistance = 0;
        //TODO Manhattan distance
        // Find tile in current grid
        findTile(0, grid);
        // Find tile in goal grid

        // Calculate difference

        // Add to MD

        return 0;
    }

    private void findTile(int i, HashMap<Position, Integer> grid) {

    }


}
