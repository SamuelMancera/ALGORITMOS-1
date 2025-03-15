package Taller1;
import java.util.Scanner;
public class cálculoExpresiónCombinada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numeroA = 1;
        int numeroB = 0;
        int numeroC = 0;
        int expresion = ( numeroA + numeroB) * numeroC / (numeroA - numeroB);

        System.out.print("Ingrese el número A: ");
        numeroA = scanner.nextInt();
        System.out.print("Ingrese el número B: ");
        numeroB = scanner.nextInt();
        System.out.print("Ingrese el número C: ");
        numeroC = scanner.nextInt();
        if (numeroA - numeroB != 0) { expresion = ( numeroA + numeroB) * numeroC / (numeroA - numeroB);
        System.out.print("El resutlado es" + " " + expresion);} 
        else {System.out.print("No se puede calcular la expresión ya que no es podible dividir entre 0");}

        scanner.close();
    }    
}
