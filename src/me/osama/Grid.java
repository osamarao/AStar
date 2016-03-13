package me.osama;

import java.util.HashMap;

/**
 * Created by Osama Rao on 12-Mar-16.
 */
public class Grid extends BaseGrid {

    public Grid(Grid another) {
        this.zeroPosition = another.zeroPosition;
        this.gridMap = another.gridMap;
    }

    @Override
    public Grid applyAction(Action action) {
        int newX, newY ;
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
        Integer tileAtToPosition = grid.gridMap.get(toPosition);
        grid.gridMap.put(toPosition, grid.gridMap.get(zeroPosition));
        grid.gridMap.put(zeroPosition, tileAtToPosition);
    }


    @Override
    public int manhattanDistance() {
        int manhattanDistance = 0;
        //TODO Manhattan distance
        for (int i = 0; i < 9; i++) {
            // Find tile in current gridMap
            Position tilePositionOnCurrentGrid = findTile(i, gridMap);
            // Find tile in goal gridMap
            Position tilePositionOnGoalGrid = findTile(i, GoalGrid.getInstance().gridMap);
            // Calculate difference
            manhattanDistance += calculateAbsoluteDifference(tilePositionOnCurrentGrid, tilePositionOnGoalGrid);
        }
        return manhattanDistance;
    }

    private int calculateAbsoluteDifference(Position tilePositionOnCurrentGrid, Position tilePositionOnGoalGrid) {
        return Math.abs((tilePositionOnCurrentGrid.getX() - tilePositionOnGoalGrid.getX())) + Math.abs((tilePositionOnCurrentGrid.getY() - tilePositionOnGoalGrid.getY())) ;
    }

    private Position findTile(int tile, HashMap<Position, Integer> grid) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (grid.get(new Position(x, y)) == tile) {
                    return new Position(x, y);
                }
            }
        }
        return null;
    }


}
