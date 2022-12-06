import java.util.Scanner;

/**
 * @author : Gabriel Jaya
 * @date : 06.dic.2022
 * @version 1.1
 * Determinar el are de un rectangulo
 */
public class App {
    /**
     * programa principal
     * @param arg, no requiere
     * @throws Exception
     */
    private static void calcularAreaRect() {
        int longitud = 0, ancho = 0, areaRect = 0;
        Scanner sc = new Scanner(System.in);
       
       
       // control+D para escoger varios del mismo nombre y cambiarlos
        System.out.print("Ingrese la longitud: ");
        longitud = sc.nextInt();
        System.out.print("Ingrese la ancho: ");
        ancho = sc.nextInt();

        areaRect = ancho*longitud;
        System.out.println("El area es: "+areaRect);
        sc.close();
    }
    private static void showSignosAlternos() {
        int nroTerminos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese  el nro. terminos: ");
        nroTerminos = sc.nextInt();

        for(int i = 0; i<nroTerminos; i++){
            //Operador terminario
            System.out.print((i%2==0)?" + ":" - ");

        }
        sc.close();
    }
    private static void drawLetraC() {
        int nroTerminos = 0;
          Scanner sc = new Scanner(System.in);
          System.out.print("Ingrese  el nro. terminos: ");
          nroTerminos = sc.nextInt();
     
          for(int i = 0; i<nroTerminos; i++){
              //Operador terminario
              System.out.print((i%2==0)?" + ":" - ");
     
          }
          System.out.println("");
          for(int i = 0; i<nroTerminos; i++){
              //Operador terminario
              System.out.println((i%2==0)?" + ":" - ");
     
          }
          for(int i = 0; i<nroTerminos; i++){
              //Operador terminario
              System.out.print((i%2==0)?" + ":" - ");
     
          }
          sc.close();
    }
    public static void main(String[] args) {
        //Declaracion de las variables e inicializadas
               //calcularAreaRect();
              showSignosAlternos();
              drawLetraC();

        
        
    }

}
