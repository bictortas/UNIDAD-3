import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        String n = sc.nextLine();
        int u = n.length()-1;
        int i = 0;
        char[] palindromo;

        palindromo = n.toCharArray();
        while(i < u){
            if(palindromo[i] == palindromo[u]){
                i++;
                u--;
            }else{
                System.out.println("No es palindormo");
                break;
            }
        }if(i >= u){
            System.out.println("El numero es palindormo");
        }

        //VICTOR HUGO RAMIREZ FEMAT




    }
}