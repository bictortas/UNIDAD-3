import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //TAREA UNIDAD 3, EJERCICIO 8
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int n = sc.nextInt();

        System.out.println("Ingresa un limite: ");
        int l = sc.nextInt();

        while (n<=l){
            for(int i =1; i<=l; i++){
                int multi = n*i;
                System.out.println(n + "x" + i + " = " + multi);
            }
            break;
        }

        //VICTOR HUGO RAMIREZ FEMAT











    }
}