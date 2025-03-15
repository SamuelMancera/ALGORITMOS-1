package Taller1;
import java.util.Scanner;
public class evaluaciónNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double notaExamen = 0.0;

        System.out.print("Ingrese la nota del examen (0 - 10 ):");
        notaExamen = scanner.nextDouble();
        if (notaExamen >= 6.0 ) {System.out.print("El estudiante aprobo");
        } else {System.out.print("El estudiante no aprobo");}
        
        scanner.close();
    }
}
