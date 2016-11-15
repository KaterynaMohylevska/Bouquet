package com.mohylevska.flowers;

/**
 * Created by cs.ucu.edu.ua on 18.10.2016.
 */
public enum FlowerColor {
    WHITE, RED, BLUE, PINK, GREEN;

    @Override
    public String toString() {
        String a = "";
        switch (this){
            case GREEN: a = "Green"; break;
            case BLUE: a = "Blue"; break;
            case PINK: a = "Pink"; break;
            case RED: a = "Red"; break;
            case WHITE: a = "White"; break;
        }
        return a;
    }
}
