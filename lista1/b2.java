import java.util.Scanner;
public class b2 {
	public static void main(String[] args) {
		int x,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número:");
		num=sc.nextInt();
		System.out.print("Números primos: ");
		for(x=1;x<=num;x++) {
		if(x%2==1) {
		System.out.printf(" %d ",x);
		}
		}
	}
}
