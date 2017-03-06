/**
 * Created by JamesHartanto on 3/3/17.
 * This program is intended to take elements as inputs and output possible existing compounds
 */
public class Main {
    public static void main(String[] args) {

        //The elements
        //    String[] group1 = {"H+","Li","Na","K"};
        //    String[] group2 = {"Be","Mg","Ca"};
        //    String[] group3  = {"B","Al"};
        //    String[] group4 = {"C","Si"};
        //    String[] group5 = {"N","P"};
        //    String[] group6 = {"O","S"};
        //    String[] group7 = {"H-","F","Cl"};
        //    String[] group8 = {"He","Ne","Ar"};

        Elements HydrogenPositive = new Elements("H",1);
        Elements Lithium = new Elements("Li",1);
        Elements Sodium = new Elements("Na",1);
        Elements Potassium = new Elements("K",1);
        Elements Beryllium = new Elements("Be",2);
        Elements Magnesium = new Elements("Mg",2);
        Elements Calcium = new Elements("Ca",2);
        Elements Boron = new Elements("B",3);
        Elements Aluminum = new Elements("Al",3);
        Elements Carbon = new Elements("C",4);
        Elements Silicon = new Elements("Si",4);
        Elements Nitrogen = new Elements("N",5);
        Elements Phosporus = new Elements("P",5);
        Elements Oxygen = new Elements("O",-2);
        Elements Sulfur = new Elements("S",-2);
        Elements HydrogenNegative = new Elements("H",-1);
        Elements Florine = new Elements("F",-1);
        Elements Chlorine = new Elements("Cl",-1);
        Elements Helium = new Elements("He",0);
        Elements Neon = new Elements("Ne",0);
        Elements Argon = new Elements("Ar",0);

        //Insert the elements here to see if an element exists
        String Answer = Elements.twoElements(HydrogenPositive,Chlorine);
        System.out.println(Answer);
    }
}