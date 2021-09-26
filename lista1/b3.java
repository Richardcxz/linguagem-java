import java.util.Scanner;
public class b3 {
	public static void main(String[] args) {
		int x,num,pro=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número entre 1 e 10:");
		num=sc.nextInt();
		System.out.print("Produtos dos números pares: ");
		for(x=1;x<=num;x++) {
		if(x%2==0) {
			pro=pro+x;
		}
		}
		System.out.printf("%d",pro);
	}
}
