package com.mohylevska.decorator;

/**
 * Created by cs.ucu.edu.ua on 08.11.2016.
 */
public abstract class ItemDecorator implements Item {
    /**
     * Determinate item
     */
    Item item;
    public ItemDecorator(Item it){
        this.item = it;
    }

}
