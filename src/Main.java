import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by cs.ucu.edu.ua on 04.10.2016.
 */
public class Main {
    public static void main(String[] args){
        Bouquet bouquet = new Bouquet();
        Camomile camomile1 = new Camomile(8 ,10);
        Camomile camomile2 = new Camomile(3.4 ,3.5);
        Camomile camomile3 = new Camomile(7.8 ,9.7);
        Tulips tulips1 = new Tulips(7,"black",7.1);
        Tulips tulips2 = new Tulips(3.9,"blue",5.4);


        bouquet.addFlower(camomile1);
        bouquet.addFlower(camomile2);
        bouquet.addFlower(camomile3);
        bouquet.addFlower(tulips1);
        bouquet.addFlower(tulips2);


        System.out.println("Sorted by fresh level bouquet: ");
        bouquet.sortLevelFresh();
        bouquet.getBouquet();

        System.out.println("\nPrice of bouquet = " + bouquet.bouquetPrice());


        System.out.println("\nFound flower by stem size");
        bouquet.findStemSize(7.1, 7.9);
    }
}
