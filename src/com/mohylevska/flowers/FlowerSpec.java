package com.mohylevska.flowers;

/**
 * Created by cs.ucu.edu.ua on 18.10.2016.
 */
public class FlowerSpec{
    protected FlowerColor color;
    protected double stemSize;
    protected double levelFresh;
    protected double price;
    protected FlowerType type;

    public FlowerSpec(FlowerColor color, double price, double stemSize){
        this.color = color;
        this.price = price;
        this.stemSize = stemSize;
    }

    public FlowerType getType() {
        return type;
    }

    public void setType(FlowerType type) {
        this.type = type;
    }
    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public void setStemSize(double stemSize) {
        this.stemSize = stemSize;
    }

    public void setFresh(double levelFresh) {
        this.levelFresh = levelFresh;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double getPrice() {
        return price;
    }
    public double getStemSize() {
        return stemSize;
    }
    public FlowerColor getColor() {
        return color;
    }
    public double getLevelFresh() {
        return levelFresh;
    }



}
