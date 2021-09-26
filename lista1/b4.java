import java.util.Scanner;
public class b4 {
	public static void main(String[] args) {
		int x,num,qnt=0;
		float media,med=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número:");
		num=sc.nextInt();
		System.out.print("Média dos números: ");
		for(x=1;x<=num;x++) {
		med=med+x;
		qnt++;
		}
		media=med/qnt;
		System.out.printf("%.1f",media);
	}
}
