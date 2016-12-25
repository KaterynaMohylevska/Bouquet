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

    /**
     *
     * @return way of pay and if that was payed
     */
    public IPayment getPayment() {
        return payment;
    }

    public void setPayment(IPayment peyment) {
        this.payment = peyment;
        for (Item item : items) {
            payment.pay(item.getPrice());
        }
    }

    /**
     *
     * @return way of delivery and if that was delivered
     */
    public IDelivery getDelivery() {
        return delivery;
    }

    /**
     * set delivery type and delivered
     * @param delivery is type of delivery
     */
    public void setDelivery(IDelivery delivery) {
        this.delivery = delivery;
        for (Item item : items) {
            delivery.deliver(item);
        }
    }

    /**
     * Calculate price with delivery
     * @return price
     */

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

    /**
     * Add item to order
     * @param item
     */
    public void addItem(Item item) {
        this.items.add(item);
    }

    /**
     * Remove item
     * @param item
     */
    public void removeItem(Item item) {
        this.items.remove(item);
    }
}
