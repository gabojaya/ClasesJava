import java.util.Scanner;

/**
 * @author : Gabriel Jaya
 * @date : 06.dic.2022
 * @version 1.1
 *          Determinar el are de un rectangulo
 */
public class App {

    private static void calcularAreaRect() {
        int longitud = 0, ancho = 0, areaRect = 0;
        Scanner sc = new Scanner(System.in);

        // control+D para escoger varios del mismo nombre y cambiarlos
        System.out.print("Ingrese la longitud: ");
        longitud = sc.nextInt();
        System.out.print("Ingrese la ancho: ");
        ancho = sc.nextInt();

        areaRect = ancho * longitud;
        System.out.println("El area es: " + areaRect);
        sc.close();
    }

    private static void showSignosAlternos() {
        int nroTerminos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese  el nro. terminos: ");
        nroTerminos = sc.nextInt();

        for (int i = 0; i < nroTerminos; i++) {
            // Operador terminario
            System.out.print((i % 2 == 0) ? " + " : " - ");

        }
        sc.close();
    }

    private static void drawLetraC() {
        int nroTerminos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese  el nro. terminos: ");
        nroTerminos = sc.nextInt();

        for (int i = 0; i < nroTerminos; i++) {
            // Operador terminario
            System.out.print((i % 2 == 0) ? " + " : " - ");

        }
        System.out.println("");
        for (int i = 0; i < nroTerminos; i++) {
            // Operador terminario
            System.out.println((i % 2 == 0) ? " + " : " - ");

        }
        for (int i = 0; i < nroTerminos; i++) {
            // Operador terminario
            System.out.print((i % 2 == 0) ? " + " : " - ");

        }
        sc.close();
    }

    private static void showPares(int nroPares) {
        for (int i = 0; i < nroPares * 2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static int suma(int a, int b) {
        return (a + b);
    }

    private static float suma(int a, float f) {
        return (a + f);
    }

    private static float suma(float a, float f) {
        return (a + f);
    }

    /**
     * programa principal
     * 
     * @param arg, no requiere
     * @throws Exception
     */
    public static void main(String[] args) {
        // Declaracion de las variables e inicializadas
        //int a = 2, b = 2, c = 0;
        //float f = 1, d = 0;
        //c = suma(a, b);
        //d = suma(a, f);
        //d = suma(f, f);
        //d= suma(f,a);

        // int nroPares = 10;
        // showPares(nroPares);
        // calcularAreaRect();
        // showSignosAlternos();
        // drawLetraC();

        showPiramide();
        showPiramide();



    }

    private static void showPiramide() {
        Scanner sc = new Scanner(System.in);
        int nroIngresado = 0;
        System.out.println("Ingrese el nivel de las escaleras");
        nroIngresado = sc.nextInt();
        for(int i = 0; i<nroIngresado; i++){
            
            

            for(int j = 0;j<i;j++){
                
                System.out.print(" ");
                    System.out.print("__");
                

                
                
            } 
            System.out.println("");
            
        }

        sc.close();
    }

}
