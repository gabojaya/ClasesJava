public class Arbolito {
    public static void main(String[] args) {
        char izq[] = "     ".toCharArray();
        char der[] = "     ".toCharArray();
        int lend = izq.length - 1;
        for (int i = 0; i < lend; i++) {
            izq[lend - i] = der[i] = '+';
            System.out.println((new String(izq)) + (new String(der)));
        }
        System.out.println("___|  |___");

System.out.println("--------------------------------------");

        int numero = 10;
         
        numero=numero*2-1;
        
        
        for (int i=1;i<=numero; i+=2) {
            
            for (int j=1;j<=numero-i;j+=2) {
                
                System.out.print(" ");
            }
       for (int k=1;k<=i;k++) {
           System.out.print("*");
       }
        System.out.println();
        }
        
        for(int i=1;i<=2;i++) {
            
            System.out.println("        ***");
        }
       
    }
}
