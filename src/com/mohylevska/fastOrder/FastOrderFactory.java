package com.mohylevska.fastOrder;

import com.mohylevska.Order;

/**
 * Created by cs.ucu.edu.ua on 22.11.2016.
 */
public class FastOrderFactory {
    /**
     * Factory create orders
     * @param type of bouquet
     * @return order
     */
    public Order createOrder(BouquetType type){
        if (type == BouquetType.WEDDING){
            Order order = new Order();
            order.addItem(new WeddingBouquet(BouquetSize.LARGE));
            return order;
        }
        return null;
    }
}
