import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.EnumSyntax;

import pkArreglo.Cadena;
import pkPatmicAnimal.*;
import pkPoliEstudiante.Estudiante;

/**
 * @author : pat_mic
 * @date : 16.dic.20202
 * @version: 1.1
 * Determinar el área de un rectángulo
 */
public class App {
    /**
     * programa princial
     * @param args, no requiere
     * @throws Exception, 
     */
    public static void main(String[] args) {
        char izq[] = "         ".toCharArray(); 
        char der[] = "         ".toCharArray(); 
        int  len  = izq.length-1;
        for (int i = 0; i < len; i++) {
            izq[len-i] = der[i]= '+';
            System.out.println((new String(izq)) + (new String(der)));
        }
        System.out.println("_______|  |_______  :) pat_mic"); 


        List<Estudiante>  lsProg = new ArrayList<>();
        //Estudiante badBunny = new Estudiante();
        Estudiante poliEstu1 = new Estudiante(1, "poliEstu1",false);
        // Estudiante poliEstu2 = new Estudiante(2, "Pepe",false);
        // Estudiante poliEstu3 = new Estudiante(3, "Fabian",false);

        // 
        // lsProg.add(poliEstu2);
        // lsProg.add(poliEstu3);

        lsProg.add(new Estudiante(1, "Lola",false));
        lsProg.add(new Estudiante(2, "Pepe",false));
        lsProg.add(poliEstu1);
        lsProg.add(new Estudiante(3, "Fabian",false));
        
        lsProg.add(1, new Estudiante(11, "atrazado",false));

        lsProg.remove(poliEstu1);

        // for (Estudiante estudiante : lsProg) {
        //     estudiante.ShowMe();
        //     System.out.println(" ----- ");
        // }


        // Cadena c = new Cadena();

        // c.showListString();


        // Iguana i = new Iguana();
        // Arana a  = new Arana();

        //i.nombre="perrita";
        // i.SayTuNombre();
        // a.SayTuNombre();
        
        
        //ShowEscalera(); 
        //drawCuadrado();
        // int a=1, b=2, c=0;
        // float f=1;

        // c = suma(a, b);
        // f = suma(a, f);
        // f = suma(f, f);
        // f = suma(f, a);

        // int nroPares =10;
        // showPares(nroPares);
        //calcularAreaRect();
        //showSignosAlternos();
        //drawLetraC();
    }

    private static void ShowEscalera() {
        int nivel =5;
        for (int i = 0; i < nivel; i++) {
            for (int d = 0; d < i; d++)
                System.out.print("  ");
            if (i>0)
                System.out.print("|");
            System.out.println("__");
        }
        System.out.println("");
    }

    private static void drawCuadrado() {
        int tanano= 5;

        for (int f = 0; f < tanano; f++) {
            for (int c = 0; c < tanano; c++)
                if (f==0 || c==0 || f == tanano -1 || c==tanano -1 )
                    System.out.print(((c+f)%2==0)?"+ ":"- "); 
                else
                    System.out.print("  "); 
            System.out.println(" "); 
        }
    }

    private static int suma(int a, int f) {
        return a+f;
    }
    private static float suma(int a, float f) {
        return a+f;
    }
    private static float suma(float a, float f) {
        return a+f;
    }

    private static void showPares(int nroPares) {
        for (int i = 0; i < nroPares * 2; i++) {
            if(i % 2 ==0 )
                System.out.println(i);
        }
    }

    private static void drawLetraC() {
        int nroTerminos=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nro. terminos:");
        nroTerminos = sc.nextInt();

        for (int i = 0; i < nroTerminos; i++) {
            System.out.print((i%2==0)?"+ ":"- ");
        }
        System.out.println("");

        for (int i = 0; i < nroTerminos; i++) {
            System.out.println((i%2==0)?"+ ":"- ");
        }
        for (int i = 0; i < nroTerminos; i++) {
            System.out.print((i%2==0)?"+ ":"- ");
        }
        System.out.println("");
        sc.close();
    }

    private static void showSignosAlternos() {
        int nroTerminos=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nro. terminos:");
        nroTerminos = sc.nextInt();

        for (int i = 0; i < nroTerminos; i++) {
            System.out.print((i%2==0)?"+ ":"- ");
        }

        System.out.println("");
        sc.close();
    }

    private static void calcularAreaRect() {
        //Declaracin de la variables e inicializadas
        int longitud=0, ancho=0, areaRect=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la longitud:");
        longitud = sc.nextInt();

        System.out.print("Ingrese la ancho:");
        ancho = sc.nextInt();

        areaRect = ancho*longitud;

        System.out.println("El area es: "+ areaRect);
        sc.close();
    }
}
