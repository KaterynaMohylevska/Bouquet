package com.mohylevska.strategy;

import com.mohylevska.decorator.Item;
import com.mohylevska.strategy.IDelivery;

/**
 * Created by cs.ucu.edu.ua on 15.11.2016.
 */
public class PostDeliveryStrategy implements IDelivery {
    /**
     * Deliver bouquet
     * @param items that have to deliver
     * @return delivered bouquet
     */
    @Override
    public boolean deliver(Item items) {
        return true;
    }
}
