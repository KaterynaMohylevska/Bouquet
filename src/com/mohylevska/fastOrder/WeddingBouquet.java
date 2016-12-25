package com.mohylevska.fastOrder;

import com.mohylevska.flowers.*;

/**
 * Created by cs.ucu.edu.ua on 22.11.2016.
 */
public class WeddingBouquet extends Bouquet{
    /**
     * Creating a special wedding bouquet
     * @param size is a number of flower in the bouquet
     */
    public WeddingBouquet(BouquetSize size){
            Bouquet bouquet = new Bouquet();
            for (int i = 0; i < size.getSize(); i++){
                FlowerSpec camomileSpec = new FlowerSpec(FlowerColor.WHITE, 25,1.7);
                camomileSpec.setType(FlowerType.CHAMOMILE);
                camomileSpec.setFresh(7);
                Flower camomile = new Flower(camomileSpec);
                bouquet.addFlower(camomile);
            }
    }
}
