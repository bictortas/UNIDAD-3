import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int n = sc.nextInt();

        System.out.println("Los divisores del numero son: ");
        for(int i=1; i<=n; i++){
             if (n % i == 0){
                 System.out.print(i + ",");
             }
        }
        //VICTOR HUGO RAMIREZ FEMAT






    }
}