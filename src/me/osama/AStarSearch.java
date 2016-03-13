package me.osama;

import java.util.PriorityQueue;

/**
 * Created by OsamaRao on 12-Mar-16.
 */
public class AStarSearch implements Search {

    private final Node startNode;
    private final Node goalNode;
    PriorityQueue<Node> open = new PriorityQueue<>();
    PriorityQueue<Node> closed = new PriorityQueue<>();


    public AStarSearch(Node startNode) {
        this.startNode = startNode;
        goalNode= new Node();
        goalNode.grid.gridMap = GoalGrid.getInstance().gridMap;
    }

    @Override
    public void search() {

    }
}
