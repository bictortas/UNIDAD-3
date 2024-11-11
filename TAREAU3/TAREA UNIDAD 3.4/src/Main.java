import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        boolean esPrimo = true;

        if(n < 2){
            esPrimo = false;
        }else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                  esPrimo = false;
                  break;
                }
            }
        }

        if(esPrimo){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }

        //VICTOR HUO RAMIREZ FEMAT
    }
}

