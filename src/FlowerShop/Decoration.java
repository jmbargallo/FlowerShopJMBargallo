package FlowerShop;

public class Decoration {


    private Material decorationMat;




    public Decoration(Material decorationMat) {
        this.decorationMat = decorationMat;

    }

    public Material getDecorationMat() {
        return decorationMat;
    }

    public void setDecorationMat(Material decorationMat) {
        this.decorationMat = decorationMat;
    }

    @Override
    public String toString() {
        String result;
        if (decorationMat.equals("WOOD")){
            result = "Fusta";
        } else {
            result = "Plastic";
        }
        return result;
    }
}
