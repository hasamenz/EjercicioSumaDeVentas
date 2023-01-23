package ejercicios.java.com;
import java.util.Scanner;
public class MultiplicacionSinPor {
    public static void main(String[] args) {
        System.out.println("MULTIPLICACION DE 2 NUMERO SIN USAR SIGNO DE MULTIPLICACION");
        int cantidad;
        int cantidad2;
        int numero2 = 0;
        int signoNegativo = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero a multiplicar:");
        cantidad = scanner.nextInt();
        System.out.println("Ingrese el segundo numero a multiplicar:");
        cantidad2 = scanner.nextInt();
        if (cantidad2 < 0){
            cantidad2 = cantidad2 * -1;
            signoNegativo++;
        }
        if (cantidad < 0){
            cantidad = cantidad * -1;
            signoNegativo++;
        }
        for (int i = 1; i <= cantidad ; i++){
            numero2 += cantidad2;
        }
        if (signoNegativo == 0){
            System.out.println("El resultado es : " +numero2);
        } else if (signoNegativo == 1) {
            System.out.println("El resultado es : " + " - " +numero2);
        } else if (signoNegativo == 2) {
            System.out.println("El resultado es : " +numero2);
        }
    }
}
