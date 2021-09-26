import java.util.Scanner;
public class a9 {
	public static void main(String[] args) {
	int N1 = 0,N2 = 0;
	int media;
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe a nota 1:");
	N1=sc.nextInt();
	System.out.println("Informe a nota 2:");
	N2=sc.nextInt();
	 media = (N1*2 + N2*3)/5;
	 if(media>=6) {
	System.out.printf("Média igual a %d, você foi aprovado",media);
	}
	 else if(media<6) {
    System.out.printf("Média igual a %d, você foi reprovado",media);
	 }
	}
}
