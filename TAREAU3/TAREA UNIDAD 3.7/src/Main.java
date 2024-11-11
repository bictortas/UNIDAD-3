import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int numero = rand.nextInt(100);
        boolean adivinado = false;

        System.out.println("Adivina el numero: ");

        while(!adivinado){
            int i = sc.nextInt();
            if(i < numero){
                System.out.println("El numero es mayor");
                adivinado = false;
            }else if(i > numero){
                System.out.println("El numero es menor");
                adivinado = false;
            }else{
                System.out.println("EAAA, ADIVINASTE");
                adivinado = true;
            }
        }

        //VICTOR HUGO RAMIREZ FEMAT










    }
}