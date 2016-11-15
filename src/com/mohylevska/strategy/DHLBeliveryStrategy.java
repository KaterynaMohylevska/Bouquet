package com.mohylevska.strategy;

import com.mohylevska.decorator.Item;
import com.mohylevska.strategy.IDelivery;

/**
 * Created by cs.ucu.edu.ua on 15.11.2016.
 */
public class DHLBeliveryStrategy implements IDelivery {
    @Override
    public boolean deliver(Item items) {
        return true;
    }
}
