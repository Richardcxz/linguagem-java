package Java.lista2;
import java.util.Scanner;
public class b5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] n = new String [16];
        int i,vog=0;

        System.out.print("Escreva até 15 letras: ");
        n[0] = sc.nextLine();

        for (i = 0; i < n[0].length(); i++){
            if(n[0].charAt(i) == 'a' || n[0].charAt(i) == 'e' || n[0].charAt(i) == 'i' 
            || n[0].charAt(i) == 'o' || n[0].charAt(i) == 'u'){
                vog++;
            }
        }
        
        System.out.println("");
        System.out.printf("Vogais na entrada: %d",vog);
    }
 }