package com.mohylevska.orders;

import com.mohylevska.flowers.Flower;
import com.mohylevska.flowers.FlowerSpec;

/**
 * Created by cs.ucu.edu.ua on 08.11.2016.
 */
public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item it) {
        super(it);
    }

    @Override
    public double getPrice(){
        System.out.println(" + paper");
        return 13 + item.getPrice();
    }

}
