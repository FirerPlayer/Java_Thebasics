package com.company;

public class Wall {
    private double height;
    private double width;

    public Wall(){
        this(0,0);
    }

    public Wall(double width, double height) {
        if(height < 0 && width < 0){
            this.height = 0;
            this.width = 0;
        }else if(height < 0){
            this.height = 0;
            this.width = width;
        }else if(width<0){
            this.height = height;
            this.width = 0;
        }else{
            this.width = width;
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0){
            this.height=0;
        }else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            this.width=0;
        }else {
            this.width = width;
        }
    }
    public double getArea(){
        return this.width * this.height;
    }
}
