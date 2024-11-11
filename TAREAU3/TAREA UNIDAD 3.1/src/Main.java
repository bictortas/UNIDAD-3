import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //EJERCICIO 1, TAREA UNIDAD 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu primera calificacion: ");
        int a = sc.nextInt();
        System.out.println("Ingresa tu segunda calificacion: ");
        int b = sc.nextInt();
        System.out.println("Ingresa tu tercera calificacion: ");
        int c = sc.nextInt();
        System.out.println("Ingresa tu cuarta calificacion: ");
        int d = sc.nextInt();
        System.out.println("Ingresa tu quinta calificacion: ");
        int e = sc.nextInt();

        if( a>0 && b>0  && c>0 && d>0 && d>0 && e>0 ){
            int promedio = (a+b+c+d+e)/5;
            if( promedio <= 7){
                System.out.println("REPROBADO");
                System.out.println("Tu promedio final es de: " + promedio);
            }else{
                System.out.println("APROBADO");
                System.out.println("Tu promedio final es de: " + promedio);
            }
        }

        //VICTOR HUGO RAMIREZ FEMAT














    }
}