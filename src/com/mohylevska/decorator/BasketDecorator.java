package com.mohylevska.decorator;

/**
 * Created by cs.ucu.edu.ua on 08.11.2016.
 */
public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item it) {
        super(it);
    }

    /**
     * Add 4 dollars for basket
     * @return price
     */
    @Override
    public double getPrice(){

        return 4 + item.getPrice();
    }
}
