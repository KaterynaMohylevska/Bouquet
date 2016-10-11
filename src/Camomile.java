/**
 * Created by cs.ucu.edu.ua on 04.10.2016.
 */
public class Camomile extends Flower{

    public Camomile(double stemSize, double levelFresh){
        this.setColor("white");
        this.setPrice(100);
        this.stemSize = stemSize;
        this.levelFresh = levelFresh;

    }

    @Override
    public boolean hasSpike() {
        return false;
    }
}
