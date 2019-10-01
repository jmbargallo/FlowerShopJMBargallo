package FlowerShop;

public class Flower {

    private String flowerColour;

    public Flower(String flowerColour) {
        this.flowerColour = flowerColour;
    }

    public String getFlowerColour() {
        return flowerColour;
    }

    public void setFlowerColour(String flowerColour) {
        this.flowerColour = flowerColour;
    }

    @Override
    public String toString() {
        return flowerColour ;
    }
}
