import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1, TAREA 3 UNIDAD 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num = sc.nextInt();
        //contadores
        int pares =0;
        int impares =0;

        while (num > 0) {
            int digito = num % 10;
            if(digito % 2 == 0){
                pares ++;
            }else{
                impares ++;
            }
            num = num / 10;
        }

        System.out.println("El numero de digitos pares dentro del numero son: " + pares);
        System.out.println("El numero de digitos impares dentro del numero son: " + impares);


        //VICTOR HUGO RAMIREZ FEMAT





    }
}