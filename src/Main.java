import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //TAREA 5- EMPLEO
        Scanner sc = new Scanner(System.in);
        System.out.println("EJERCICIO 1: " + "\n");



        System.out.println("Eres Ciudadano o Residente?");
        String tipoCandidato = sc.nextLine();

        if (tipoCandidato.equals("Ciudadano") || tipoCandidato.equals("Residente")) {
            System.out.println("Elegible para cualquier puesto");
        } else {
            System.out.println("Visa :");
            String visaValida = sc.nextLine();
            if(visaValida.equals("Valida")){

                System.out.println("Cuantos anios de expieriencia tienes?");
                int experiencia = sc.nextInt();
                if(experiencia >= 5){
                    System.out.println("Elegible para un empleo calificado");
                } else if (experiencia < 5) {
                    System.out.println("Elegible para un empleo no calificado");
                }
            }else{
                System.out.println("Visa invalida, Candidato rexhazado");
            }

        }




    //IDENTIDAD
        System.out.println("EJERCICIO 2: " + "\n");


        System.out.println("Ingresa tu pais de recidencia: ");
        String paisResidencia = sc.nextLine();
        if (paisResidencia.equals("USA")){
            System.out.println("Ingresa tu codigo postal: ");
            String codigoPostal = sc.nextLine();

            if(codigoPostal.charAt(0) == '9'){
                System.out.println("Has hecho compras previas?");
                String comprasPrevias = sc.nextLine();

                if(comprasPrevias.equals("Si")){
                    System.out.println("Ha hecho compras previas, puede pagar con PayPal");
                }else{
                    System.out.println("Se le pide realizar una verificación con su dirección.");
                }
            }else {
                System.out.println("Utiliza tarjeta de credito");
            }

        } else if (paisResidencia.equals("Europa")) {
            System.out.println("Ingresa tu codigo postal: ");
            String codigoPostal = sc.nextLine();

            if(codigoPostal.length() == 5){
                System.out.println("Has hecho compras previas?");
                String comprasPrevias = sc.nextLine();

                if(comprasPrevias.equals("Si")){
                    System.out.println("Ha hecho compras previas, puede pagar con transferencia bancaria");
                }else{
                    System.out.println("Se le pide realizar una verificación bancaria.");
                }
            }else {
                System.out.println("Codigo postal invalido,su compra no puede ser realizada");
            }

        }else{
            System.out.println("Pais invalido,se le pide una verificación manual de identidad.");

        }



        System.out.println("EJERCICIO 3: " + "\n");

        boolean suiteDisponible = false;

        System.out.println("Ingrese la cantidad de personas: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        if (cantidad == 1){

            System.out.println("Ingrese el tipo de habitacion que desea: ");
            String preferencia = sc.nextLine();

            if(preferencia.equals("Suite")){
                System.out.println("Duracion de estadia: ");
                int duracion = sc.nextInt();
                if(suiteDisponible == true && duracion > 3){
                    System.out.println("Hay Suite disponibles, Se le ofrece un descuento del 10%");
                } else if (suiteDisponible == false || duracion <= 3) {
                    System.out.println("Se ofrece una habitacion estandar");
                }

            } else if (preferencia.equals("Estandar")) {
                System.out.println("Se le asigna una habitación estándar sin verificaciones.");
            }

        } else if (cantidad >= 2){
            System.out.println("Ingrese el tipo de habitacion que desea: ");
            String preferencia = sc.nextLine();

            if(preferencia.equals("Suite") && suiteDisponible == true){
                System.out.println("Duracion de estadia: ");
                int duracion = sc.nextInt();
                if(duracion > 5){
                    System.out.println("Se ofrece un paquete con desayuno incluido.");
                } else if (duracion <= 5) {
                    System.out.println("Solo la suite sin paquete.");
                }

            } else if (preferencia.equals("Estandar") || suiteDisponible == false) {
                System.out.println("Se le asigna una habitación doble estándar.");
            }

        }




    }
}