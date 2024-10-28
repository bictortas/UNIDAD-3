import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 1");
        //Imprimir números del 1 al 10

        int numero = 1;

        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }
        //Suma de los primeros 10 números naturales:
        System.out.println("EJERCICIO 2");
        int suma = 0;
        int numeroDos = 1;
        while (numeroDos <= 10) {
            suma += numeroDos;
            numeroDos++;
        }
        System.out.println("El resultado de sumar los primeros 10 numeros naturales es: " + suma);
        //Contar dígitos de un número:
        System.out.println("EJERCICIO 3");

        int numeroTres = 4567;
        int contador = 0;
        while (numeroTres != 0) {
            numeroTres /= 10;
            contador++;
        }

        System.out.println("El número tiene " + contador + " dígitos.");

        //Imprimir números pares entre 1 y 20
        System.out.println("EJERCICIO 4 ");
        int numeroCuatro = 1;
        while (numeroCuatro <= 20) {
            numeroCuatro++;
            if (numeroCuatro % 2 == 0) {
                System.out.println(numeroCuatro);
            }
        }

        //Sumar dígitos de un número:
        System.out.println("EJERCICIO 5");
        int numeroCinco = 4567;
        int sumaDos = 0;
        while (numeroCinco != 0) {
            sumaDos = sumaDos + numeroCinco % 10;
            numeroCinco /= 10;
        }
        System.out.println("La suma de los numeros es: " + sumaDos);

        System.out.println("EJERCICIO 6");
        //Múltiplos de un número hasta cierto límite
        int numeroMultiplo = 5;
        int multiploCont = 1;
        int limite = 25;

            while ((numeroMultiplo * multiploCont) <= limite) {
                String texto = numeroMultiplo + "x" + multiploCont + "=";
                int multiplicacion = numeroMultiplo * multiploCont;
                System.out.println(texto + multiplicacion);
                multiploCont++;
            }


        //Suma de dígitos pares de un número
        System.out.println("EJERCICIO 7");
        int numeroSiete = 4567;
        int sumaPar = 0;

            while (numeroSiete != 0) {
                 int par = numeroSiete % 10;
                if (par % 2 == 0) {
                    sumaPar += par;
                }
                numeroSiete /= 10;
            }
        System.out.println("La suma de los numeros pares es:" + sumaPar);

        //Imprimir números en orden inverso:
        System.out.println("EJERCICIO 8");

        int numeroOcho = 4567;
        int numeroInvertido = 0;

        while (numeroOcho != 0) {
             int digito = numeroOcho % 10;
             numeroInvertido = (numeroInvertido * 10) + digito;
             numeroOcho /= 10;
        }
        System.out.println("Numero invertido: "+numeroInvertido);

        //Suma de dígitos impares de un número
        System.out.println("EJERCICIO 9");
        int numeroNueve = 4567;
        int sumaImpar = 0;

        while (numeroNueve != 0) {
            int impar = numeroNueve % 10;
            if (impar % 2 == 0) {

            }else{
                sumaImpar += impar;
            }
            numeroNueve /= 10;
        }
        System.out.println("La suma de los numeros Impares es:" + sumaImpar);

        //Contar vocales de una cadena:
        System.out.println("EJERCICIO 10");

        String palabra = "palabra";
        int contadorPalabra = 0;
        int indice = 0;

        while (indice < palabra.length()){
            char letra = palabra.charAt(indice);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'){
                contadorPalabra++;
            }
            indice++;
        }
        System.out.println("La cantidad de vocales en la palabra palabra es: " + contadorPalabra);

        //Determinar si un número es perfecto
        System.out.println("EJERCICIO 11");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numeroUsuario = sc.nextInt();
        int divisorCont = 1;
        int sumaDivisores = 0;

        while (divisorCont <= numeroUsuario / 2) {
            if(numeroUsuario % divisorCont == 0){
                sumaDivisores += divisorCont;
            }
            divisorCont++;
        }
            if(sumaDivisores == numeroUsuario){
                System.out.println("Es un numero perfecto");
            }else{
                System.out.println("No es un numero perfecto");
            }




















    }
}












