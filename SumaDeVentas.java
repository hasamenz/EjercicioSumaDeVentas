package ejercicios.java.com;

import java.util.Scanner;

public class SumaDeVentas {
    public static void main(String[] args) {
        System.out.println("SISTEMA DE SUMA DE VENTAS");
        Scanner scanner = new Scanner(System.in);
        int numeroDeVentas;
        double cantidadDeVenta;
        double sumaDeVentas = 0;

        System.out.println("Ingrese el numero de Ventas Realizadas : ");
        numeroDeVentas = scanner.nextInt();

        for (int i = 1; i <= numeroDeVentas; i++){
            System.out.println("Ingrese la venta numero : " +i);
            cantidadDeVenta = scanner.nextDouble();
            System.out.println("Ingreso " +cantidadDeVenta);
            sumaDeVentas += cantidadDeVenta;
        }
        System.out.println("La suma de todas las ventas es : " +sumaDeVentas);

    }
}
