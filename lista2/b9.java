package Java.lista2;
import java.util.Scanner;
public class b9 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] n1 = new int [11];
        int[] n2 = new int [21];
        int[] cj = new int [21];

        System.out.print("Entre com 10 números: ");
        for(i=1;i<=10;i++){
        n1[i] = sc.nextInt();}

        System.out.println("");

        System.out.print("Entre com mais 10 números: ");
        for(i=11;i<=20;i++){
        n2[i] = sc.nextInt();}

        for(i=1;i<=20;i++){
        if(i<=10){
        cj[i] = n1[i];
        }
        else if(i>10){
        cj[i] = n2[i];
        }
        }

        System.out.print("Vetor 3: ");
        
        for(i=1;i<=20;i++){
        if(i==1){
        System.out.printf("{%d, ", cj[i]);
        }
        if(i>1 && i<20){
        System.out.printf("%d, ",cj[i]);
        }
        if(i==20){
        System.out.printf("%d}", cj[i]);  
        }
        } 
    }}