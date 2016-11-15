package com.mohylevska.orders;

import com.mohylevska.flowers.Flower;
import com.mohylevska.flowers.FlowerSpec;

/**
 * Created by cs.ucu.edu.ua on 08.11.2016.
 */
public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item it) {
        super(it);
    }
    public double getPrice(){
        System.out.println("+ ribbon");
        return 40 + item.getPrice();
    }


}
