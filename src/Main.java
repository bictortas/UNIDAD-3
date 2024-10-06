public class Main {
    public static void main(String[] args) {
        //INPUT
        String nombreCliente = "Carlos Martinez";
        String direccionIp = "192.168.0.1";
        String numeroCliente = "12345";

        //Cambiar vocales
        String vocalesCambiadas = nombreCliente.replace("a","1").replace("e","2").replace("i","3").replace("o", "4").replace("u","5");


        //Cambiar primer y ultimo caracter
        String primerCaracter = String.valueOf(nombreCliente.charAt(0));
        String ultimoCaracter = String.valueOf(nombreCliente.charAt(14));
        String nombreCifrado = vocalesCambiadas.replace(primerCaracter,"/").replace(ultimoCaracter,primerCaracter).replace("/", ultimoCaracter);


        //IP A HEXADECIMAL
        String[] segmentos = direccionIp.split("\\.");

        int primerNum = Integer.parseInt(segmentos[0]);
        int segundoNum = Integer.parseInt(segmentos[1]);
        int tercerNum = Integer.parseInt(segmentos[2]);
        int cuartoNum = Integer.parseInt(segmentos[3]);


        String hexaUno = Integer.toHexString(primerNum);
        String hexaDos = Integer.toHexString(segundoNum);
        String hexaTres = Integer.toHexString(tercerNum);
        String hexaCuatro = Integer.toHexString(cuartoNum);
        String ipFinal = hexaUno + "." + hexaDos + "." + hexaTres + "." + hexaCuatro;


        //NUMERO DEL CLIENTE
        int numCliente = Integer.parseInt(numeroCliente);
        double numeroCifrado = ((numCliente *3) +15)/2;

        //OUTPUT FINAL

        String output = nombreCifrado + "/" + ipFinal + "/" + numeroCifrado;
        System.out.println("Datos cifrados:" + output);

        //FIN
    }
}