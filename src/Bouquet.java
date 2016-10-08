/**
 * Created by cs.ucu.edu.ua on 04.10.2016.
 */
public class Bouquet{
    private int max = 17;

    private Flower[] flowers = new Flower[max];

    private int lastIndex = 0;

    public void addFlower(Flower newFlower){

        if (max - 1 < lastIndex ){
            Flower[] newFlowers = new Flower[max * 2];
            for (int i = 0; i < max; i++){
                newFlowers[i] = flowers[i];
            }
            max = max * 2;
            flowers = newFlowers;
        }

        flowers[lastIndex] = newFlower;
        lastIndex++;

    }

    public void getBouquet(){
        for (int i = 0; i < lastIndex; i++){
            System.out.println(flowers[i].getClass().getName() + ", color is " + flowers[i].getColor() + ", price = "
                    + flowers[i].getPrice() + ", stem size = " + flowers[i].stemSize
                    + ", fresh level = " + flowers[i].levelFresh);
        }
    }

    public void sortLevelFresh(){
        for (int i = 1; i < lastIndex; i++){
            double level = flowers[i].levelFresh;
            Flower flower = flowers[i];
            int position = i;
            while (position > 0 && flowers[position - 1].levelFresh > level){
                flowers[position] = flowers[position - 1];
                position = position - 1;
            }
            flowers[position] = flower;
        }
    }

    public double bouquetPrice(){
        double price = 0;
        for (int j = 0; j < lastIndex; j++){
            price += flowers[j].getPrice();
        }
        return price;
    }

    public void findStemSize(double minSize, double maxSize){
        for (int i = 1; i < lastIndex; i++){
            if (minSize <=  flowers[i].stemSize && flowers[i].stemSize <= maxSize){
                System.out.println(flowers[i].getClass().getName() + ", color is " + flowers[i].getColor() + ", price = "
                        + flowers[i].getPrice() + ", stem size = " + flowers[i].stemSize
                        + ", fresh level = " + flowers[i].levelFresh);
                return;
            }
        }
    }

}
