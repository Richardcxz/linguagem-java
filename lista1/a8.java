import java.util.Scanner;
public class a8 {
	public static void main(String[] args) {
		int num,x,con=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número para fatoração: ");
		num=sc.nextInt();
		con=num;
		System.out.printf("%d",num);
		for(x=num-1;x>=1;x--) {
			System.out.printf(".%d",x);
			con=con*x;
		}
		System.out.printf(" = %d",con);
	}
}
