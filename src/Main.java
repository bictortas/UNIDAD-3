import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingresa tu puntaje crediticio (entre 300 y 850");
        int puntaje = sc.nextInt();

        System.out.println("Ingresa tus ingresos mensuales:");
        int ingresos = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingresa la cantidad que deseas solicitar: ");
        int cantidad = sc.nextInt();

        System.out.println("Duracion de prestamo en anios:");
        int duracion = sc.nextInt();

        System.out.println("Porcentaje de ahorro personal: ");
        int ahorro = sc.nextInt();


        if(nombre.matches(".*\\d.*")){
            System.out.println("El usuario no debe de contener digitos");
        }else{
            if(puntaje < 600 ){
                System.out.println("Solicitud rechazada");
            }else if(puntaje >=600 && puntaje <= 740 ){
                double interes= cantidad * 0.06;
                double r = interes / 12;
                int n = duracion * 12;
                double cuotaMensual = cantidad * (Math.pow(1 + r ,n)) / (Math.pow(1 + r ,n)-1);


                if(ingresos < cuotaMensual * 3){
                    System.out.println("Error: tus ingresos mensuales no son suficientes.");
                }else {
                    double montoTotal = cuotaMensual * n;
                    System.out.printf("Nombre: %s, Estado: Aprobado, Tasa de Interés: %.2f%%, Cuota Mensual: %.2f, Monto Total: %.2f\n",
                            nombre, interes * 100, cuotaMensual, montoTotal);
                }


            } else if ( puntaje > 740) {
                double interes= cantidad * 0.04;
                double r = interes / 12;
                int n = duracion * 12;
                double cuotaMensual = cantidad * (Math.pow(1 + r ,n)) / (Math.pow(1 + r ,n)-1);

                if(ingresos < cuotaMensual * 2.5){
                    System.out.println("Error: tus ingresos mensuales no son suficientes.");
                }else {
                    double montoTotal = cuotaMensual * n;
                    System.out.printf("Nombre: %s, Estado: Aprobado, Tasa de Interés: %.2f%%, Cuota Mensual: %.2f, Monto Total: %.2f\n",
                            nombre, interes * 100, cuotaMensual, montoTotal);
                }
            }
        }
















    }
}