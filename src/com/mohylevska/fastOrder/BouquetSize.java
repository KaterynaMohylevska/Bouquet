package com.mohylevska.fastOrder;

/**
 * Created by cs.ucu.edu.ua on 22.11.2016.
 */
public enum BouquetSize {
    LARGE(30), MEDIUM(15), SMALL(5);

    /**
     *
     * @return sixe of bouquet
     */
    public int getSize() {
        return size;
    }

    private int size;

    /**
     * determine number of flower in Bouquet
     * @param size is number of flower
     */
    BouquetSize(int size){
        this.size = size;
    }

}
