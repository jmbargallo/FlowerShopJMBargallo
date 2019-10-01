package FlowerShop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create flowershop
        Scanner a = new Scanner(System.in);
        System.out.println("Nom de la floristeria? ");
        String name = a.nextLine();
        FlowerShop shopName = new FlowerShop(name);

        //add tree
        boolean moreTrees = true;
        while (moreTrees = true){
            System.out.println("Vols entrar un arbre? S o N?");
            Scanner e = new Scanner(System.in);
            String mt = e.nextLine();

            if (mt.equalsIgnoreCase("s")){
                moreTrees = true;
                shopName.createTree();
            } else {
                moreTrees = false;
                System.out.println("Afegir flors");
                break;
            }
        }


        //add flower
        boolean moreFlowers = true;
        while (moreFlowers = true){
            System.out.println("Vols entrar una flor? S o N?");
            Scanner e = new Scanner(System.in);
            String mf = e.nextLine();

            if (mf.equalsIgnoreCase("S")){
                moreFlowers = true;
                shopName.createFlower();
            } else {
                moreFlowers = false;
                System.out.println("Afegir decoracio");
                break;
            }
        }


        //add decoration
        boolean moreDecorations = true;
        while (moreDecorations = true){
            System.out.println("Vols entrar una decoracio? S o N?");
            Scanner e = new Scanner(System.in);
            String md = e.nextLine();

            if (md.equalsIgnoreCase("s")){
                moreDecorations = true;
                shopName.createDecoration();
            } else {
                moreDecorations = false;
                break;
            }
        }

        //print stock
        System.out.println(
                shopName.toString().replaceAll("\\[\\]", ""));
    }


}
