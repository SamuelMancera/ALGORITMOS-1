package Taller1;
import java.util.Scanner;
public class añoBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int año = 0;

        System.out.print("Ingrese el año: ");
        año = scanner.nextInt();
        if ( año % 4 == 0 && año % 100 != 0) {System.out.print( año + " " + " Es un año bisiesto ");  
        } else {if (año % 400 == 0) {System.out.print( año + " " + " Es un año bisiesto ");} 
        else {System.out.print( año + " " + " No es un año bisiesto ");}}
        
        scanner.close();
    }   
}
