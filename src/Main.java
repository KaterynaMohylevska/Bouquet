import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by cs.ucu.edu.ua on 04.10.2016.
 */
public class Main {
    public static void main(String[] args){
        Bouquet bouquet = new Bouquet();
        FlowerSpec camomile3Spec = new FlowerSpec();
        camomile3Spec.setType("Camomile");
        camomile3Spec.setColor(FlowerColor.WHITE);
        camomile3Spec.setStemSize(1.8);
        camomile3Spec.setPrice(20);
        camomile3Spec.setFresh(7);

        FlowerSpec camomile2Spec = new FlowerSpec();
        camomile2Spec.setType("Camomile");
        camomile2Spec.setColor(FlowerColor.WHITE);
        camomile2Spec.setStemSize(1.8);
        camomile2Spec.setPrice(30);
        camomile2Spec.setFresh(10);

        FlowerSpec camomile1Spec = new FlowerSpec();
        camomile1Spec.setType("Camomile");
        camomile1Spec.setColor(FlowerColor.WHITE);
        camomile1Spec.setStemSize(1.7);
        camomile1Spec.setPrice(25);
        camomile1Spec.setFresh(7);

        FlowerSpec tulip1Spec = new FlowerSpec();
        tulip1Spec.setType("Tulip");
        tulip1Spec.setColor(FlowerColor.PINK);
        tulip1Spec.setStemSize(1.7);
        tulip1Spec.setPrice(20);
        tulip1Spec.setFresh(9);

        FlowerSpec tulip2Spec = new FlowerSpec();
        tulip2Spec.setType("Tulip");
        tulip2Spec.setColor(FlowerColor.RED);
        tulip2Spec.setStemSize(2);
        tulip2Spec.setPrice(15);
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

        System.out.println("Price of bouquet = " + bouquet.bouquetPrice());

        FlowerSpec spec = new FlowerSpec();
        spec.setType("Tulip");
        spec.setColor(FlowerColor.GREEN);
        spec.setStemSize(2);
        spec.setPrice(20);
        spec.setFresh(7);

        System.out.println("\nSearched: ");
        Flower[] searched = bouquet.search(spec);
        for (int i = 0; i < searched.length - 1; i++){
            System.out.println(searched[i].toString());
        }
    }
}
