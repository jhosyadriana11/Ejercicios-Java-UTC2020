package morse;
import java.util.Scanner;
public class Principal {
	private static Scanner scan;
	  
    static String[] abecedario = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                  "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", 
                  "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                  " " };

    static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", " " };
    
  
    public static void main(String args[]) {
    	System.out.println("Ingrese la frase a transformar: ");
    	scan = new Scanner(System.in);
    	String teclado = scan.nextLine();
    	fraseMorse(teclado);
    	fraseAbc(teclado);
    }
    
    
    // FUNCIÓN PARA TRANSFORMAR A CÓDIGO MORSE
    public static void fraseMorse(String entrada){
        String[] vmorse = entrada.split(" ");
        System.out.println(" ");
        // CICLO QUE INTERACTUA CON VALORES INGRESADOS
        for(int i=0 ; i<vmorse.length; i++){
            // CICLO QUE COMPARA EL INGRESO DEL USUARIO Y EL VECTOR DE CÓDIGO MORSE
            for(int j=0; j<morse.length ;j++){
                if(vmorse[i].equals(morse[j])){
                    // SALIDA DEL VALOR CORRESPONDIDO AL ABECEDARIO
                    System.out.print(abecedario[j]);
                }
            }// ESPACIOS
            if(vmorse[i].equals("")){
                System.out.print(" ");
                i++;
            }
        }
    }
    
    // FUNCIÓN PARA TRANSFORMAR A ABECEDARIO
    public static void fraseAbc(String entrada){
         // CICLO QUE INTERACTUA CON VALORES INGRESADOS
        for(int i=0; i < entrada.length() ; i++){
            char aux = entrada.charAt(i);
            // CICLO QUE COMPARA EL INGRESO DEL USUARIO Y EL VECTOR DE ABECEDARIO
            for(int j=0; j<abecedario.length ;j++){
                if(String.valueOf(aux).equals(abecedario[j])) {
                    // SALIDA DEL VALOR CORRESPONDIDO AL CÓDIGO MORSE
                    System.out.print(morse[j]+" ");
                }
            }
        }
    }
}