/**
 * Created by cs.ucu.edu.ua on 18.10.2016.
 */
public class FlowerSpec {
    protected FlowerColor color;
    protected double stemSize;
    protected double levelFresh;
    protected double price;
    protected String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public void setStemSize(double stemSize) {
        this.stemSize = stemSize;
    }

    public void setFresh(double levelFresh) {
        this.levelFresh = levelFresh;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double getPrice() {
        return price;
    }
    public double getStemSize() {
        return stemSize;
    }
    public FlowerColor getColor() {
        return color;
    }
    public double getLevelFresh() {
        return levelFresh;
    }



}
