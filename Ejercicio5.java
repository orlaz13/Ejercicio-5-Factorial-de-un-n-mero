import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        while (numero < 0) {
            System.out.print("Ingrese un numero no negativo: ");
            numero = sc.nextInt();
        }
        long factorial = 1;
        int contador = 1;
        while (contador <= numero) {
            factorial = factorial * contador;
            contador = contador + 1;
        }
        System.out.println("Factorial = " + factorial);
        sc.close();
    }
}