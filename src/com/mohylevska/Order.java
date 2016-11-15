package com.mohylevska;

import com.mohylevska.decorator.Item;
import com.mohylevska.strategy.IDelivery;
import com.mohylevska.strategy.IPayment;

import java.util.LinkedList;
/**
 * Created by cs.ucu.edu.ua on 15.11.2016.
 */
public class Order {
    LinkedList<Item> items = new LinkedList<>();
    protected IPayment payment;
    protected IDelivery delivery;

    public IPayment getPayment() {
        return payment;
    }

    public void setPayment(IPayment peyment) {
        this.payment = peyment;
        for (Item item : items) {
            payment.pay(item.getPrice());
        }
    }

    public IDelivery getDelivery() {
        return delivery;
    }

    public void setDelivery(IDelivery delivery) {
        this.delivery = delivery;
        for (Item item : items) {
            delivery.deliver(item);
        }
    }

    public double calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
            if (this.delivery.deliver(item)){
                System.out.println("+10 for deliver");
                totalPrice += 10;
            }
        }


        return totalPrice;
    }
    public void addItem(Item items) {
        this.items.add(items);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }
}
