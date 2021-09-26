package Java.lista2;
import java.util.Scanner;
public class a5 {
	public static void main(String[] args) {
		int x,y,c=0;
		int s;
		int[] n = new int [48];
		Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma sequência de 12 números, exemplo 1 4 4 2 5 5 3 6 6 4 7 7");
        for(x=1;x<=12;x++){
			n[x]=sc.nextInt();
			if(n[x]>0){
			c++;
			}}
		
		System.out.print("Sequência 1 = ");

        for(x=1;x<=c;x=x+3){
        System.out.printf("%d ", n[x]);
		}
        System.out.println("");
		System.out.print("Sequência 2 = ");

			System.out.printf("%d ",n[2]);
			System.out.printf("%d ",n[3]);
			System.out.printf("%d ",n[5]);
			System.out.printf("%d ",n[6]);
			System.out.printf("%d ",n[8]);
			System.out.printf("%d ",n[9]);
			System.out.printf("%d ",n[11]);
			System.out.printf("%d ",n[12]);
         }}