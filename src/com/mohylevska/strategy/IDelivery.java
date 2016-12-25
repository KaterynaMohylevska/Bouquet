package com.mohylevska.strategy;

import com.mohylevska.decorator.Item;

/**
 * Created by cs.ucu.edu.ua on 08.11.2016.
 */
public interface IDelivery {
    /**
     * Deliver bouquet
     * @param items that have to deliver
     */
    boolean deliver(Item items);
}
