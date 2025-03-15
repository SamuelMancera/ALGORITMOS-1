package Taller1;
import java.util.Scanner;
public class comparaciónNúmeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroA = 0;
        int numeroB = 0;

        System.out.print("Ingrese el valor del numero A:");
        numeroA = scanner.nextInt();
        System.out.print("Ingrese el valor del numero B:");
        numeroB = scanner.nextInt();
        if (numeroA == numeroB) { System.out.print("Los dos valores ingresados son iguales");
        } else {if (numeroA > numeroB) { System.out.println(numeroA + " " +"es mayor que"+ " " + numeroB); 
        } else {System.out.println(numeroB +" " + "es mayor que" + " " + numeroA); } }
        
        scanner.close();
    }
}
