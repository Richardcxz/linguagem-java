package Java.lista2;
import java.util.Scanner;
public class b3 {
    public static void main(String[] args) {
		int x,med,som=0;
		Scanner sc = new Scanner(System.in);
        int[] n = new int [11];
        System.out.println("Insira 10 números, exemplo 1 2 3 4");
        for(x=1;x<=10;x++){
        n[x]=sc.nextInt();
        }
        for(x=1;x<=10;x++){
        som=som+n[x];
        }
        med=som/10;
        System.out.print("Soma dos números: ");
        System.out.printf("%d ",som);

        System.out.print("Média: ");
        System.out.printf("%d ",med);
        }
 }

