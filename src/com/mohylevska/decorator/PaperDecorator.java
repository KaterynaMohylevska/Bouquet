package com.mohylevska.decorator;

/**
 * Created by cs.ucu.edu.ua on 08.11.2016.
 */
public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item it) {
        super(it);
    }

    @Override
    public double getPrice(){
        return 13 + item.getPrice();
    }

}
