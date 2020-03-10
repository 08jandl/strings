package campus02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //schauen wir uns noch ein altbekanntes array an

        int[]feld = new int[] {1,2,3};

        //Hilfsmethode um ein array auszugeben

        System.out.println(Arrays.toString(feld));
        System.out.println("------");

	// write your code here
        //2 dimensionales array
        int[][] feld2dim = new int [3][4];

        //einem Element etwas zuweisen
        feld2dim[1][2] = 42;

        System.out.println(Arrays.toString(feld2dim[0]));
        System.out.println(Arrays.toString(feld2dim[1]));
        System.out.println(Arrays.toString(feld2dim[2]));

        System.out.println("----------");

        //andere initialisierung

        int[][] feld2dim2 = new int[][] {{1,2,3,},{4,5,6}};
        System.out.println(Arrays.toString(feld2dim2[0]));
        System.out.println(Arrays.toString(feld2dim2[1]));

        //kurz input string: strg.length gibt uns Länge vom String an
        String str = "Hallo ZAM";
        System.out.println(str.length());

        //Strings dürfen nicht mit == verglichen werden (macht was anderes
        //aber equals Methode kann zum Vergleichen verwendet werden
        System.out.println(str.equals("Hallo ZAM"));


    }
}
