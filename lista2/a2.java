package Java.lista2;
import java.util.Scanner;
public class a2 {
	public static void main(String[] args) {
		int x,n1,n2,n3,n4,n5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira 5 números, exemplo 1 2 3 4 5");
		n1=sc.nextInt(); n2=sc.nextInt(); n3=sc.nextInt(); n4=sc.nextInt(); n5=sc.nextInt();
		System.out.print("Números múltiplos de 3: ");
		if(n1%3==0){
			System.out.printf("%d ",n1);
		}
		if(n2%3==0){
			System.out.printf("%d ",n2);
		}
		if(n3%3==0){
			System.out.printf("%d ",n3);
		}
		if(n4%3==0){
			System.out.printf("%d ",n4);
		}
		if(n5%3==0){
			System.out.printf("%d ",n5);
		}
		System.out.println("");
		System.out.print("Números múltiplos de 5: ");
		if(n1%5==0){
			System.out.printf("%d ",n1);
		}
		if(n2%5==0){
			System.out.printf("%d ",n2);
		}
		if(n3%5==0){
			System.out.printf("%d ",n3);
		}
		if(n4%5==0){
			System.out.printf("%d ",n4);
		}
		if(n5%5==0){
			System.out.printf("%d ",n5);
		}
	}
}