package me.osama;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Start Grid");
        Grid startGrid = new Grid(null, null);
        int[] startTiles = new int[]{ 5,2,4,1,0,3,8,7,6 };
        startGrid.layGrid(startTiles);
        //startGrid.printGrid();
//
//        System.out.println("Goal Grid");
        GoalGrid goalGrid = GoalGrid.getInstance();
        goalGrid.layGrid(new int[]{ 5,2,4,1,7,3,8,6,0 });
        System.out.println("Goal Grid");
        goalGrid.printGrid();
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
        AStarSearch aStarSearch = new AStarSearch(new Node(startGrid));
        boolean searchStatus = aStarSearch.search();
        if (searchStatus){
            System.out.println("search Complete");
            //aStarSearch.printPath();
        } else {
            System.out.println("Search Failed");
        }
//        Node node = new Node(startGrid);
//            Node selectNode = null;
//        for (Action action : Action.values()) {
////            System.out.println(action);
//            Node childNode = node.nextState(action);
////            childNode.grid.printGrid();
////            System.out.println("f(n) = " + childNode.getF());
//            int f = 1000000;
//            if (childNode.getF() < f)
//                selectNode = childNode;
////            if (childNode.grid != null) {
////                if (!explored.contains(childNode) || !frontier.contains(childNode)) {
////                    frontier.add(childNode);
////                } else if (frontier.contains(childNode)) {
////                    frontier.removeIf(new LowerChildPredicate(childNode));
////                    frontier.add(childNode);
////                }
////            }
//        }
//        System.out.println(selectNode.grid.zeroPosition);
//        selectNode.grid.printGrid();
//
//        System.out.println("node selected");
//        System.out.println("applying moves to selected node");
//
//        Node selectedNodeCopy = new Node(selectNode.grid);
//        System.out.println("selectednodecopy zeroposition " + selectedNodeCopy.grid.zeroPosition);
//        for (Action action : Action.values()) {
//            System.out.println(action);
//            Node childNode = selectedNodeCopy.nextState(action);
//            if (childNode.grid != null){
//                System.out.println("After Applied...");
//                childNode.grid.printGrid();
//                int f = 1000000;
//                if (childNode.getF() < f)
//                    selectNode = childNode;
//            } else {
//                System.out.println("Illegal Move");
//            }
//
//
//        }
//        System.out.println(selectNode.grid.zeroPosition);
//        selectNode.grid.printGrid();
    }


}
