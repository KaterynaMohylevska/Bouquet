package com.mohylevska.decorator;

import com.mohylevska.decorator.Item;
import com.mohylevska.decorator.ItemDecorator;

/**
 * Created by cs.ucu.edu.ua on 08.11.2016.
 */
public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item it) {
        super(it);
    }
    public double getPrice(){
        return 40 + item.getPrice();
    }


}
