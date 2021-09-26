package Java.lista2;
import java.util.Scanner;
public class c1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float[] n = new float [21];
        float men;
        int x;

        for(x=1;x<=20;x++){
        System.out.printf("Altura da pessoa [%d]: ",x);
        n[x] = sc.nextFloat();
        System.out.println("");
        }
        men=n[1];
        System.out.print("Menor altura: ");
        for(x=1;x<=20;x++){
        if(n[x]<men){
            men=n[x];
        } }
    System.out.printf("%.2f",men);
}}