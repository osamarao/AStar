package me.osama;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Start Grid");
        Grid startGrid = new Grid();
        int[] startTiles = new int[]{ 5,2,4,1,0,3,8,7,6 };
        startGrid.layGrid(startTiles);
        startGrid.printGrid();
//
//        System.out.println("Goal Grid");
//        GoalGrid goalGrid = GoalGrid.getInstance();
//        goalGrid.layGrid(new int[]{ 5,2,4,1,7,3,8,6,0 });
//        goalGrid.printGrid();
//        startGrid.printGrid();
//        System.out.println(goalGrid.manhattanDistance());
//
//        System.out.println(startGrid.manhattanDistance());

        // PriorityQueue<Node> frontier = new PriorityQueue<>();

//        frontier.add(startState.nextState(Action.UP, 950));
//        frontier.add(startState.nextState(Action.UP, 490));
//        frontier.add(startState.nextState(Action.UP, 910));
//        frontier.add(startState.nextState(Action.UP, 930));
//
//        frontier.poll().call();
//        frontier.poll().call();
//        frontier.poll().call();
//        frontier.poll().call();
//        AStarSearch aStarSearch = new AStarSearch(new Node(startGrid));
//        boolean searchStatus = aStarSearch.search();
//        if (searchStatus){
//            aStarSearch.printPath();
//        } else {
//            System.out.println("Search Failed");
//        }
        Node node = new Node(startGrid);
        for (Action action : Action.values()) {
            System.out.println(action);
            Node childNode = node.nextState(action);
            childNode.grid.printGrid();
//            if (childNode.grid != null) {
//                if (!explored.contains(childNode) || !frontier.contains(childNode)) {
//                    frontier.add(childNode);
//                } else if (frontier.contains(childNode)) {
//                    frontier.removeIf(new LowerChildPredicate(childNode));
//                    frontier.add(childNode);
//                }
//            }
        }
    }


}
