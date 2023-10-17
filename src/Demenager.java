import java.util.ArrayList;
import java.util.Scanner;

public class Demenager{

    public static void main(String[] args) {

        afichevoyage();

    }
    public static void afichevoyage(){

        int totalCarton =  34;
        int capaciteCamion = 9;
        int boxMove = 0 ;


        while(totalCarton > 0){

            int rest = totalCarton % capaciteCamion;

            if(rest == 0){

                System.out.println("un voyage de " + capaciteCamion +" cartons");
                boxMove = boxMove + 9;

            }

            totalCarton --;

        }
        System.out.println("un voyage de " + (34-boxMove) +" cartons");

    }
}