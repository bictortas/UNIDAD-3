import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1. Sistema de Administración de Cursos
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre completo: ");
        String nombreEstudiante = sc.nextLine();
        System.out.println("Ingresa tu ID: ");
        String ID = sc.nextLine();
        System.out.println("Ingresa tu promedio: ");
        double promedio = sc.nextDouble();

        if (promedio < 7.0) {
            System.out.println("No puedes inscribirte a ninguna materia.");
        } else if (promedio >= 7.0 && promedio < 8.5) {
            Scanner intput = new Scanner(System.in);
            System.out.println("A que materias deseas inscribirte (Escribelas separandolas por una diagonal).");
            String materias = intput.nextLine();
            String[] listaMaterias = materias.split("/");
            int veces = listaMaterias.length;

            if (veces < 3) {
                System.out.println("Se te permite la inscripcion");
            } else {
                System.out.println("Sobrecarga academica, se te niega la inscripcion");
            }

        } else if (promedio >= 8.5) {
            Scanner intput = new Scanner(System.in);
            System.out.println("A que materias deseas inscribirte (Escribelas separandolas por una diagonal).");
            String materias = intput.nextLine();
            String[] listaMaterias = materias.split("/");
            int veces = listaMaterias.length;

            if (nombreEstudiante.length() > 25) {
                System.out.println("Nombre muy largo, corrigelo");
            } else if (ID.length() < 8) {
                System.out.println("se le niega la inscripción por formato incorrecto.");
            } else if (veces <= 5) {
                System.out.println("se le permite la inscripción en todas las materias.");
            } else {
                System.out.println("Cuantas materias aprobaste el semestre pasado?");
                int materiasPasadas = sc.nextInt();
                if (materiasPasadas > 3) {
                    System.out.println("Puedes inscribirte hasta 6 materias.");
                } else {
                    System.out.println("Solo puedes inscribirte hasta 5 materias.");
                }
            }
        }
        System.out.println("FIN EJERCICIO 1 \n");

        //2. Sistema de Compra de Boletos para Eventos
        Scanner intput = new Scanner(System.in);
        System.out.println("Tipo de membresia: ");
        String membresia = intput.nextLine();


        if (membresia.equals("Premium")){
            System.out.println("Edad: ");
            int edad = intput.nextInt();
            intput.nextLine();
            System.out.println("Tipo de evento: ");
            String evento = intput.nextLine();
            
            if (evento.equals("Internacional") && edad < 18){
                System.out.println("se le niega la compra para eventos internacionales.");
            } else if (evento.equals("Internacional") && edad >= 18 && edad < 25) {
                System.out.println("se le ofrece un descuento del 20%.");
            }else if (evento.equals("Nacional") && edad >= 18 && edad < 25){
                System.out.println("se le ofrece un descuento del 10%.");
            }else if (evento.equals("Internacional") && edad >= 25){
                System.out.println("se le ofrece un descuento del 25%.");
            } else if (evento.equals("Nacional") && edad >= 25) {
                System.out.println("se le ofrece un descuento del 15%.");
            }


        } else if (membresia.equals("Estandar")) {
            System.out.println("Edad: ");
            int edad = intput.nextInt();
            intput.nextLine();
            System.out.println("Tipo de evento: ");
            String evento = intput.nextLine();

            if (evento.equals("Internacional") && edad < 18){
                System.out.println("se le niega la compra para eventos internacionales.");
            } else if (evento.equals("Internacional") && edad >= 18 ) {
                System.out.println("Para eventos internacionales no tiene descuentos.");
            }else if (evento.equals("Nacional") && edad >= 18){
                System.out.println("Para eventos nacionales se le ofrece un 5% de descuento.");
            }


        }else if (membresia.equals("Basica")) {
            System.out.println("Edad: ");
            int edad = intput.nextInt();
            intput.nextLine();
            System.out.println("Tipo de evento: ");
            String evento = intput.nextLine();
            System.out.println("No tiene derecho a descuentos ni puede comprar boletos para eventos internacionales.");
        }
        System.out.println("FIN EJERCICIO 2 \n");

        //3. Sistema de Evaluación de Beneficios de Seguro Médico
        System.out.println("Ingresa tu nombre: ");
        String nombreDos = intput.nextLine();

        System.out.println("Ingresa tu edad : ");
        int edad = intput.nextInt();
        intput.nextLine();

        System.out.println("Ingresa tu pais de residencia: ");
        String paisResidencia = intput.nextLine();

        System.out.println("Ingresa tu estado civil: ");
        String estadoCivil = intput.nextLine();

        System.out.println("Ingresos anuales: ");
        double ingresos = intput.nextInt();
        intput.nextLine();

        System.out.println("Tienes hijos: ");
        String hijos = intput.nextLine();

        if (nombreDos.matches(".*\\d.*")){
            System.out.println("El usuario no debe de contener digitos");
        }else{
            if (edad < 25){
                System.out.println("No eres elegible para beneficios");
            }else{
                if (paisResidencia.equals("Mexico") && estadoCivil.equals("Casado")){
                    if(ingresos < 300000 ){
                        if(hijos.equals("si")){
                            double descuento = ingresos * .10;
                            double montoFinal = ingresos - descuento;
                            String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombreDos, descuento, montoFinal);
                            System.out.println(resultado);
                        }else{
                            double descuento = ingresos * .05;
                            double montoFinal = ingresos - descuento;
                            String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombreDos, descuento, montoFinal);
                            System.out.println(resultado);
                        }
                    }
                } else if (paisResidencia.equals("Mexico") && estadoCivil.equals("Soltero")) {
                    if(ingresos < 400000){
                        double descuento = ingresos * .08;
                        double montoFinal = ingresos - descuento;
                        String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombreDos, descuento, montoFinal);
                        System.out.println(resultado);
                    }else{
                        System.out.println("No recibes beneficios");
                    }

                }else if(paisResidencia.equals("USA")){
                    if(ingresos < 500000 && estadoCivil.equals("Casado")){
                        double descuento = ingresos * .12;
                        double montoFinal = ingresos - descuento;
                        String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombreDos, descuento, montoFinal);
                        System.out.println(resultado);
                    } else if (ingresos < 200000 && estadoCivil.equals("soltero")) {
                        double descuento = ingresos * .07;
                        double montoFinal = ingresos - descuento;
                        String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombreDos, descuento, montoFinal);
                        System.out.println(resultado);
                    } else if (hijos.equals("si")) {
                        double descuento = ingresos * .03;
                        double montoFinal = ingresos - descuento;
                        String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombreDos, descuento, montoFinal);
                        System.out.println(resultado);
                    }
                }else {
                    double descuento;
                    double descuentoAdicional = 0;

                    if (estadoCivil.equals("casado")) {
                        System.out.println("Se aplica 5% de descuento");
                        descuento = ingresos * .05;
                    } else {
                        descuento = ingresos * .03;
                    }

                    if (ingresos < 200000) {
                        descuentoAdicional = ingresos * .02;
                    }

                    double montoFinal = ingresos - descuento - descuentoAdicional;

                    String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombreDos, descuento, montoFinal);
                    System.out.println(resultado);
                    }
                }
            }



        }


}




