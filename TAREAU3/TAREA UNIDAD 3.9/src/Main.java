import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //TAREA UNIDAD 3, EJERCICIO 9
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingresa el tercer numero: ");
        int num3 = sc.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println("Los tres números son iguales: " + num1 + ", " + num2 + ", " + num3);
        } else if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("El orden es: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("El orden es: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("El orden es: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("El orden es: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("El orden es: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("El orden es: " + num3 + ", " + num2 + ", " + num1);
            }
        }
        //VICTOR HUGO RAMIREZ FEMAT





    }
}