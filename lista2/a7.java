package Java.lista2;
import java.util.Scanner;
public class a7 {
	public static void main(String[] args) {
		int x,som,tot=0;
        int[] n = new int [11];
        int[] cub = new int [11];
		Scanner sc = new Scanner(System.in);

        System.out.println("Insira os números = ");
        n[1]=sc.nextInt();n[2]=sc.nextInt();n[3]=sc.nextInt();n[4]=sc.nextInt();n[5]=sc.nextInt();
        n[6]=sc.nextInt();n[7]=sc.nextInt();n[8]=sc.nextInt();n[9]=sc.nextInt();n[10]=sc.nextInt();
        System.out.println("");

        for(x=1;x<=10;x++){
        cub[x]=n[x]*n[x]*n[x];
        System.out.printf("Cubo de %d = %d ",n[x],cub[x]);
        } } }