package me.osama;

/**
 * Created by OsamaRao on 12-Mar-16.
 */
public class Grid extends BaseGrid {

    @Override
    public Grid applyAction(Action action) {
        return null;
    }

    private void swapZero() {

    }


    @Override
    public int manhattanDistance() {
        GoalGrid.getInstance().printGrid();
        return 0;
    }


}
