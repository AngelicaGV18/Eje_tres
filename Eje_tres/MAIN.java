package Eje_tres;

import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Datos x = new Datos();

        System.out.println("");
        System.out.println("");

        System.out.print("DIGITE UNA PALABRA : ");
        x.setPalabra(tec.next());

        System.out.println("");
        System.out.println("");

        System.out.println("VER DATOS");
        System.out.println("------------------");
        System.out.println("");

        System.out.println(x.ver_datos());
        System.out.println("TIENE : (" + x.getPalabra().length() + ") LETRAS");
        System.out.println("TIENE (" + x.contar_vocales() + ") VOCALES");

        System.out.println("");
        System.out.println("");

        System.out.println(x.separar_palabra());
        System.out.println(x.invertir_palabra());

        System.out.println("");
        System.out.println("");
        x.sustituir_vocales_paso_1();
        System.out.println("");
        System.out.println("");
        System.out.println(x.sustituir_vocales_paso_3());

        System.out.println("");
        System.out.println("");

    }
}
