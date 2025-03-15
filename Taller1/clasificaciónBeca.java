package Taller1;
import java.util.Scanner;
public class clasificaciónBeca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double promedioNotas = 0.0;
        double porcentajeAsistencia = 0.0;

        System.out.print("Ingrese el promedio de notas: ");
        promedioNotas = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje de asistencia (sin el símbolo %): ");
        porcentajeAsistencia = scanner.nextDouble();
        if (promedioNotas >= 8.5 && porcentajeAsistencia >= 90.0 ) { System.out.print("El estudiante SI clasifica para beca");} 
        else {System.out.print("El estudiante NO clasifica para beca");}

        scanner.close();
    }   
}
