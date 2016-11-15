package com.mohylevska.orders;

/**
 * Created by cs.ucu.edu.ua on 08.11.2016.
 */
public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item it) {
        super(it);
    }

    @Override
    public double getPrice(){
        System.out.println("+ basket");
        return 4 + item.getPrice();
    }
}
