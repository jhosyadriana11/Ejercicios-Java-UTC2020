package romanos;
import java.util.Scanner;
public class Principal {
	private static Scanner scan;
	public static void main(String args[])  {
    	System.out.println("Ingrese el número a transformar: ");
    	scan = new Scanner(System.in);
    	int teclado = scan.nextInt();
    	Romano(teclado);
    }
	
    public static void Romano(int num){
        int numeros[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String romanos[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int i=12;    
        while(num>0) {
        	int division = num/numeros[i];
        	num = num%numeros[i];
	        while(division>0){
	            System.out.print(romanos[i]);
	            division--;
	        }
	          i--;
        }
    }
}