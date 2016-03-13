package me.osama;

/**
 * Created by Osama Rao on 17-Feb-16.
 */
public class Node implements INode, IHeuristic, Comparable<INode>{
    Node parent;
    int  g ;
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
    public Node nextState() {
        return null;
    }


    public void setG(int g) {
        this.g = g;
    }

    @Override
    public int compareTo(INode o) {
        if (getF() > o.getF()){
            return 1;
        } else if (getF() < o.getF()){
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int getH() {
        return 0;
    }
}
