
import java.util.Arrays;
import java.util.Scanner;

public class combinacion {

	public static int calcularfactorial(int numIngresado) {
		int i = 0, f = 1;

		for (i = 1; i <= numIngresado; i++)
			f = f * i;
		return f;
	}

	public static int calcularNroCombinaciones(int n, int r) {
		int c;
		c = calcularfactorial(n) / (calcularfactorial(r) * calcularfactorial(n - r));
		return c;
	}

	public static void showCombinaciones(char[] conjunto, int k, int combina) {
		char[] conjuntosPeques = new char[k];
		for (int i = 0; i < combina; i++) {

		}

	}

	public static void main(String[] args) {

		int n = 0, k = 0, combina = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("*****************");
		char[] conjunto = { 'a', 'b', 'c', 'd', 'e', 'f' };
		n = conjunto.length;
		System.out.println("Su conjunto es"+Arrays.toString(conjunto));
		System.out.println("Introduzca la cantidad de elementos que conformaran un grupo:");
		k = sc.nextInt();
		combina = calcularNroCombinaciones(n, k);
		System.out.println("Combinaciones = " + combina);
		
		void combinacionSR(char* items,char** almacen,int n,int r,int* indexs,int i,int *cont){
		    if(i<r){
		        if(i==0){
		            initParams(r,&indexs,&cont);
		            indexs[i] = 0;
		        }else{
		            indexs[i] = indexs[i-1] + 1;
		        }
		        while(indexs[i]<n){
		            combinacionSR(items,almacen,n,r,indexs,i+1,cont);
		            indexs[i] = indexs[i] + 1;
		        }
		    }else{
		        almacenando(items,almacen,r,indexs,cont);
		    }
		}
		
		
		
		

	}
}