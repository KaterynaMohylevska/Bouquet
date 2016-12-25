package com.mohylevska.flowers;

/**
 * Created by cs.ucu.edu.ua on 04.10.2016.
 */
public class Flower {
    /**
     * Flower class
     */

    protected FlowerSpec spec;

    /**
     *
     * @param spec is FlowerSpec
     */
    public Flower(FlowerSpec spec) {
        this.spec = spec;
    }


    public FlowerType getType() { return spec.getType();}

    public void setType(FlowerType type) { spec.setType(type);}

    public double getPrice() {
        return spec.getPrice();
    }

    public void setPrice(double price) {
        spec.setPrice(price);
    }

    public FlowerColor getColor(){
        return spec.getColor();
    }

    public void setColor(FlowerColor color){
        spec.setColor(color);
    }

    public double getLevelFresh() {
        return spec.getLevelFresh();
    }

    public void setFresh(double levelFresh) {
        spec.setFresh(levelFresh);
    }

    public double getStemSize() {
        return spec.getStemSize();
    }

    public void setStemSize(double stemSize) {
        spec.setStemSize(stemSize);
    }

    public String toString() {
        return "Type: " + getType() + ", price is " + String.valueOf(getPrice())
                + ", its color is " + getColor() + ", fresh level is " + String.valueOf(getLevelFresh())
                + ", its stem size is " + String.valueOf(getStemSize());
    }

}
