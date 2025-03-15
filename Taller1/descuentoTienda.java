package Taller1 ;
import java.util.Scanner;
public class descuentoTienda { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double precioProducto = 0.0;
        boolean tieneCupon = true;
        double descuento15 = 0;
        double compraDescuento = 0;

        System.out.print("Ingrese el precio del producto:");
        precioProducto = scanner.nextDouble();
        System.out.print ("¿Tiene cupón? (true para indicar que sí, false para indicar que no):");
        tieneCupon = scanner.nextBoolean(); 
        if ( precioProducto > 50 && tieneCupon == true) {
            descuento15 = precioProducto * 0.15;
            compraDescuento = precioProducto - descuento15;
             System.out.println( "Se aplicó el descuento, el valor final es:" + " " + compraDescuento);  
        } else {System.out.println("No tiene descuento el precio es"+" " + precioProducto); }
        
        scanner.close();
    }   
}
