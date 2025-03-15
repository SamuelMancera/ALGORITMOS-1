package Taller1;
import java.util.Scanner;
public class numeroParImpar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.print("Ingrese un numero:");
        numero = scanner.nextInt();
        if (numero % 2 == 0) {System.out.println(numero + " " +"es par");
        } else {System.out.println(numero + " " + "es impar");}
        
        scanner.close();
    }
}