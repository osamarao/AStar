package me.osama;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter Start Grid Config");
//        System.out.println("Start Grid");
        Grid startGrid = new Grid(null, null);

        startGrid.layGrid();
        System.out.println("Start Grid");
        startGrid.printGrid();
//
        System.out.println("Enter Goal Grid Config");

        GoalGrid goalGrid = GoalGrid.getInstance();
        goalGrid.layGrid();
        System.out.println("Goal Grid");
        goalGrid.printGrid();

        // That site's goal state
        goalGrid.layGrid(new int[]{ 1,2,3,8,0,4,7,6,5 });

        startSearch(startGrid);
    }

    private static void startSearch(Grid startGrid) {
        AStarSearch aStarSearch = new AStarSearch(new Node(startGrid));
        boolean searchStatus = aStarSearch.search();
        if (searchStatus){

            aStarSearch.printPath();
            System.out.println("Search Complete");
        } else {
            System.out.println("Search Failed");
        }
    }


}
