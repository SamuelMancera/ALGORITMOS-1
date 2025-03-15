package Taller1;
import java.util.Scanner;
public class comprobaciónMúltiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int numero1= 0;
        int numero2= 0;

        System.out.print("Ingrese el primer número:");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número:");
        numero2 = scanner.nextInt();
        if ( numero1 % numero2 == 0 ) {System.out.print( numero2 + " " + "Si es múltiplo de" + " "+ numero1 + " " +
        ".El segundo número SI es múltiplo del primero ");} 
        else {System.out.print(numero2 + " " + "No es múltiplo de" + " "+ numero1 + " " +
        ".El segundo número NO es múltiplo del primero ");}

        scanner.close();
    }        
}
