/**
 * Created by Lazarus on 4.11.2016.
 */
public class Harjutus5_5 {
    public static void main(String[]args){
        verse(99, " bottles of beer");

    }
    public static void verse(int beerBottles, String bob){
        if (beerBottles==0){
            System.out.println("No"+bob+" on the wall,");
            System.out.println("no"+bob+",");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
            System.out.println("’cause there are no more"+bob+" on the wall!");
        }
        else {

            System.out.println(beerBottles + bob + " on the wall,");
            System.out.println(beerBottles + bob + ",");
            System.out.println("ya’ take one down, ya’ pass it around,");
            System.out.println(beerBottles - 1 + bob + " on the wall.");
            System.out.println();
            verse(beerBottles - 1, bob);
        }
    }
}
