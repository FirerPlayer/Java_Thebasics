package com.company;

public class Point {
    private int x;
    private int y;

    public Point(){
        this.x=0;
        this.y=0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(getX()*getX() + getY()*getY());
    }
    public double distance(int x, int y){
        return Math.sqrt((getX()-x)*(getX()-x) + (getY()-y)*(getY()-y));
    }
    public double distance(Point point){
        return Math.sqrt((getX()-point.getX())*(getX()-point.getX()) + (getY()-point.getY())*(getY()-point.getY()));
    }
}
