package me.osama;

/**
 * Created by Osama Rao on 17-Feb-16.
 */
public class Node implements INode, Comparable<INode> {
    Node parent;
    Grid grid;

    @Override
    public void call() {
        System.out.println(getF());
    }

    @Override
    public int getF() {
        return 1 + grid.manhattanDistance(); // cost of next state plus the Manhattan Distance of the next State
    }

    @Override
    public Node nextState(Action action) {
        Node node = new Node();
        node.parent = this;
        node.grid = grid.applyAction(action);
        return node;
    }

    @Override
    public int compareTo(INode o) {
        if (getF() > o.getF()) {
            return 1;
        } else if (getF() < o.getF()) {
            return -1;
        } else {
            return 0;
        }
    }
}
