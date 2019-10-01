package FlowerShop;

public class Tree {


    //Init
    private float treeHeight;


    //Constructor
    public Tree( float treeHeight) {
        this.treeHeight = treeHeight;

    }
    //Getters & setters
    public float getTreeHeight() {
        return treeHeight;
    }

    public void setTreeHeight(float treeHeight) {
        this.treeHeight = treeHeight;
    }
    //Getters & setters

    //Print data
    @Override
    public String toString() {
        String treeHeightS = String.valueOf(treeHeight);
        return treeHeightS;
    }
}
