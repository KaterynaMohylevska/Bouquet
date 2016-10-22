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

    public String getBouquet(){
        String bouq = "";
        for (int i = 0; i < lastIndex; i++){
            bouq += flowers[i].toString() + "\n";
        }
        return bouq;
    }

    public void sortLevelFresh(){
        for (int i = 1; i < lastIndex; i++){
            double level = flowers[i].getLevelFresh();
            Flower flower = flowers[i];
            int position = i;
            while (position > 0 && flowers[position - 1].getLevelFresh() > level){
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

    public Flower[] search(FlowerSpec spec){
        Flower[] searched = new Flower[lastIndex + 1];
        int index = 0;
        for (int i = 1; i < lastIndex; i++){
            if (flowers[i].getPrice() == spec.getPrice()){
                searched[index] = flowers[i];
                index++;
            }
            else if (flowers[i].getStemSize() == spec.getStemSize()){
                searched[index] = flowers[i];
                index ++;
            }
            else if (flowers[i].getType() == spec.getType()){
                searched[index] = flowers[i];
                index ++;
            }
            else if (flowers[i].getLevelFresh() == spec.getLevelFresh()){
                searched[index] = flowers[i];
                index ++;
            }
            else if (flowers[i].getColor() == spec.getColor()) {
                searched[index] = flowers[i];
                index ++;
            }

        }
        Flower[] newSearched = new Flower[index + 1];
        for (int i = 0; i < index + 1; i ++){
            newSearched[i] = searched[i];
        }

        return newSearched;
    }

}
