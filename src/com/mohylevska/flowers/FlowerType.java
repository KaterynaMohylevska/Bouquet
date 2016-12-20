package com.mohylevska.flowers;

/**
 * Created by cs.ucu.edu.ua on 13.12.2016.
 */
public enum FlowerType {
    CHAMOMILE, TULIP;

    @Override
    public String toString() {
        String a = "";
        switch (this){
            case CHAMOMILE: a = "Chamomile"; break;
            case TULIP: a = "Tulip"; break;
        }
        return a;
    }
}
