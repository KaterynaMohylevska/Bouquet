/**
 * Created by cs.ucu.edu.ua on 04.10.2016.
 */
public class Tulips extends Flower {
    public Tulips(double stemSize, String color, double levelFresh){
        this.setColor(color);
        this.stemSize = stemSize;
        this.setPrice(20);
        this.levelFresh = levelFresh;
    }
    @Override
    public boolean hasSpike() {
        return true;
    }
}
