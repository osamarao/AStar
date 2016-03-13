package me.osama;

/**
 * Created by Osama Rao on 12-Mar-16.
 */
public class Grid extends BaseGrid {

    @Override
    public Grid applyAction(Action action) {
        // Is move valid
        if (action == Action.UP){
            // add 1 to x
            // calculate new position
            int newX = zeroPosition.getX() + 1;
            if (newX <=2 || newX >= 0){
                return null; // invalid move
            } else {
                swapZero(new Position(newX, zeroPosition.getY()));
            }
        }

        return null;
    }

    private void swapZero(Position position) {
        Position tempPosition = new Position(0,0);
    }


    @Override
    public int manhattanDistance() {
        GoalGrid.getInstance().printGrid();
        return 0;
    }


}
