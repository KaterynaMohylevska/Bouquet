package com.mohylevska.strategy;

/**
 * Created by cs.ucu.edu.ua on 15.11.2016.
 */
public class CreditCartPaymentStrategy implements IPayment {
    @Override
    public boolean pay(double price) {
        return true;
    }
}