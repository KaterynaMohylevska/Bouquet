package com.mohylevska;

import com.mohylevska.flowers.*;
import com.mohylevska.decorator.BasketDecorator;
import com.mohylevska.decorator.Item;
import com.mohylevska.decorator.PaperDecorator;
import com.mohylevska.decorator.RibbonDecorator;
import com.mohylevska.strategy.CreditCartPaymentStrategy;
import com.mohylevska.strategy.PostDeliveryStrategy;

/**
 * Created by cs.ucu.edu.ua on 04.10.2016.
 */
public class Main {


    // FOR TUPLE
/*    public static void main(String[] args){
        Tuple<Integer, String>[] tpls = new Tuple[3];
        tpls[0] = new Tuple<Integer, String>(10, "bla");
        tpls[1] = new Tuple<Integer, String>(1, "blabla");
        tpls[2] = new Tuple<Integer, String>(4, "rrrr");
        System.out.println(Arrays.toString(tpls));
        Arrays.sort(tpls);
        System.out.println(Arrays.toString(tpls));

    }*/


    public static void main(String[] args){
        Bouquet bouquet = new Bouquet();
        FlowerSpec camomile3Spec = new FlowerSpec(FlowerColor.WHITE,20,1.8);

        camomile3Spec.setType("Camomile");
        camomile3Spec.setFresh(7);

        FlowerSpec camomile2Spec = new FlowerSpec(FlowerColor.WHITE,20,1.8);
        camomile2Spec.setType("Camomile");
        camomile2Spec.setFresh(10);

        FlowerSpec camomile1Spec = new FlowerSpec(FlowerColor.WHITE, 25,1.7);
        camomile1Spec.setType("Camomile");
        camomile1Spec.setFresh(7);

        FlowerSpec tulip1Spec = new FlowerSpec(FlowerColor.PINK, 20,1.7);
        tulip1Spec.setType("Tulip");
        tulip1Spec.setFresh(9);

        FlowerSpec tulip2Spec = new FlowerSpec(FlowerColor.RED,15,2);
        tulip2Spec.setType("Tulip");
        tulip2Spec.setFresh(7);

        Flower camomile3 = new Flower(camomile3Spec);
        Flower camomile2 = new Flower(camomile2Spec);
        Flower camomile1 = new Flower(camomile1Spec);
        Flower tulip1 = new Flower(tulip1Spec);
        Flower tulip2 = new Flower(tulip2Spec);
        bouquet.addFlower(camomile1);
        bouquet.addFlower(camomile2);
        bouquet.addFlower(camomile3);
        bouquet.addFlower(tulip1);
        bouquet.addFlower(tulip2);



        bouquet.sortLevelFresh();
        System.out.println("Sorted by fresh level bouquet: \n" + bouquet.getBouquet());

        FlowerSpec spec = new FlowerSpec(FlowerColor.GREEN,20,2);
        spec.setType("Tulip");
        spec.setFresh(7);

        System.out.println("\nSearched: ");
        com.mohylevska.flowers.Flower[] searched = bouquet.search(spec);
        for (int i = 0; i < searched.length - 1; i++){
            System.out.println(searched[i].toString());
        }

        System.out.println("\nPrice of bouquet = " + bouquet.getPrice());

        System.out.println("\nAdditional to the bouquet:");
        Item item = new PaperDecorator(new BasketDecorator(new RibbonDecorator(bouquet)));
        System.out.println("\nPrice:");
        System.out.println("+ basket");
        System.out.println(" + paper");
        System.out.println("+ ribbon");
        System.out.println(item.getPrice());

        System.out.println("\nORDER!!");
        Order order = new Order();
        order.addItem(item);
        System.out.println("Delivered by post");
        order.setDelivery(new PostDeliveryStrategy());
        System.out.println("Payed by a credit car");
        order.setPayment(new CreditCartPaymentStrategy());
        System.out.println("Total price: ");
        System.out.println(order.calculateTotalPrice());

    }
}
