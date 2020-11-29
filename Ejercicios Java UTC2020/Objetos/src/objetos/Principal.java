package objetos;
import java.util.Scanner;
public class Principal {
    static Cubo cubo;
    static double Numactual;
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        init ();
        loop ();
        scanner.nextLine();
    }

    private static void loop(){
        int  operacion = get_menu();
        while(operacion != 5){
        	Numactual = calculate(operacion ,cubo);
            System.out.println("El resultado es " +Numactual+ "\n");
            operacion = get_menu ();
        }
        init ();
        loop ();
    }

    private static void init(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la medida del lado:");
        try{
            double lado  = Double.parseDouble( scanner.nextLine());
            cubo = new Cubo(lado);
        }
        catch (NumberFormatException nfe){
            System.out.println ("La medida debe de ser un entero");
            init ();
        }
    }


    public static double calculate( int operacion, Cubo cubo){

        double resultado = 0;
        switch (operacion){
            case 1: resultado = cubo.calcularPerimetro(true);
            break;
            case 2: resultado =cubo.calcularPerimetro(false);
            break;
            case 3: resultado = cubo.calcularArea();
            break;
            case 4: resultado = cubo.calcularVolumen(); 
            break;
            case 5: init();
            break;
            case 6: System.out.println ("Finalizado"); System.exit(0);
            break;
        }
        return resultado;
    }

    public static int get_menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Ingrese la operación que desea realizar:\n");
        System.out.print ("1: Calcular perímetro del cuadrado\n");
        System.out.print ("2: Calcular perímetro del cubo\n");
        System.out.print ("3: Calcular área\n");
        System.out.print ("4: Calcular volúmen\n");
        System.out.print ("5: Reiniciar programa \n");
        System.out.print ("6: Terminar programa \n");
        int operacion  = Integer.parseInt(scanner.nextLine());
        return operacion;
    }
}