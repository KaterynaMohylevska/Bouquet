package com.mohylevska.strategy;

/**
 * Created by cs.ucu.edu.ua on 08.11.2016.
 */
public interface IPayment {
    /**
     * Pay for order
     * @param price of bouquet
     */
    boolean pay(double price);
}
