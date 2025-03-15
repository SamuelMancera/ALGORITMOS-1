package Taller1;
import java.util.Scanner;
public class validaciónContraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String contraseña = "A";
        int numeroCaracteres = 0;

        System.out.print("Ingrese la contraseña:");
        contraseña = scanner.next();
        numeroCaracteres = contraseña.length();
        if (numeroCaracteres >= 8 )
        {System.out.println("Contraseña válida");} else 
        {System.out.println("Contraseña inválida");}
        
        scanner.close();
    }        
}
