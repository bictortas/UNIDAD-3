import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa hasta que numero se detendra la serie: ");

        int n = sc.nextInt();
        int a = 0, b = 1;

        System.out.print("Secuencia de Fibonacci hasta " + n + ": ");
        while (a <= n) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        //VICTOR HUGO RAMIREZ FEMAT















    }
}