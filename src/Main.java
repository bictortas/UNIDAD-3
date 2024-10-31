public class Main {
    public static void main(String[] args) {

        String cadena = "book";
        int largo = Integer.valueOf(cadena.length());
        //MITADES
        String mitadUno = cadena.substring(0, largo/2);
        String mitadDos = cadena.substring(largo/2);
        //CONTADORES
        int contarVocalesA = 0;
        int contarVocalesB = 0;
        int a = 0;
        int b = 0;
        //VOCALES
        String vocales = "aeiouAEIU";

        //COMPARAR PRIMERA MITAD
        while (a < mitadUno.length()) {
            char letra = mitadUno.charAt(a);
            if(vocales.contains(String.valueOf(letra))) {
                contarVocalesA++;
            }
            a++;
        }
        //COMPARAR SEGUNDA MITAD
        while (b < mitadDos.length()) {
            char letra = mitadDos.charAt(b);
            if(vocales.contains(String.valueOf(letra))) {
                contarVocalesB++;
            }
            b++;
        }

        boolean sonIguales = contarVocalesA == contarVocalesB;
        System.out.println("Las mitades contienen la misma cantidad de vocales: " + sonIguales);
























    }
}