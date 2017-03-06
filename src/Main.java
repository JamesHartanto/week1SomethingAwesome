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

        Elements Hpos = new Elements();
        Elements Li = new Elements();
        Elements Na = new Elements();
        Elements K = new Elements();
        Elements Be = new Elements();
        Elements Mg = new Elements();
        Elements Ca = new Elements();
        Elements B = new Elements();
        Elements Al = new Elements();
        Elements C = new Elements();
        Elements Si = new Elements();
        Elements N = new Elements();
        Elements P = new Elements();
        Elements O = new Elements();
        Elements S = new Elements();
        Elements Hneg = new Elements();
        Elements F = new Elements();
        Elements Cl = new Elements();
        Elements He = new Elements();
        Elements Ne = new Elements();
        Elements Ar = new Elements();

        //Group 1
        Hpos.name = "HydrogenPositive";
        Hpos.value = 1;
        Li.name = "Lithium";
        Li.value = 1;
        Na.name = "Sodium";
        Na.value = 1;
        K.name = "Potassium";
        K.value = 1;

        //Group 2
        Be.name = "Beryllium";
        Be.value = 2;
        Mg.name = "Magnesium";
        Mg.value = 2;
        Ca.name = "Calcium";
        Ca.value = 2;

        //Group 3
        B.name = "Boron";
        B.value = 3;
        Al.name = "Aluminum";
        Al.value = 3;

        //Group 4
        C.name = "Carbon";
        C.value = 4;
        Si.name = "Silicon";
        Si.value = 4;

        //Group 5
        N.name = "Nitrogen";
        N.value = 5; //Not quite true
        P.name = "Phosphorus";
        P.value = 5; //Not true

        //Group 6
        O.name = "Oxygen";
        O.value = -2;
        S.name = "Sulfur";
        S.value = -2;

        //Group 7
        Hneg.name = "HydrogenNegative";
        Hneg.value = -1;
        F.name = "Florine";
        F.value = -1;
        Cl.name = "Chlorine";
        Cl.value = -1;

        //Group 8
        He.name = "Helium";
        He.value = 0;
        Ne.name = "Neon";
        Ne.value = 0;
        Ar.name = "Argon";
        Ar.value = 0;


        //Not sure why I cannot call the method
        //twoElements(Hpos,Hneg);
    }
}