package Java.lista2;
import java.util.Scanner;
import java.lang.Math;
public class a3 {
	public static void main(String[] args) {
		int x,y,esc;
        int[] n = new int [31];
        int min=1,max=250;
		Scanner sc = new Scanner(System.in);
    System.out.println("Deseja fornecer 30 números ou preencher automaticamente?");
    System.out.println("1-Automaticamente  2-Fornecer");
    esc=sc.nextInt();
    if(esc==2){
    for(x=1;x<=30;x++){
    System.out.printf("Forneca o número %d: ",x);
    n[x]=sc.nextInt();
    }}

    if(esc==1){
    for(x=1;x<=30;x++){
    int gen=(int)Math.floor(Math.random()*(max-min+1)+min);
    n[x]=gen;
    }
for(x=1;x<=30;x++){
    for(y=1;y<=30;y++){
        if(n[x]==n[y]){
    int gen=(int)Math.floor(Math.random()*(max-min+1)+min);
    n[x]=gen;
        }
    }
}
}
    System.out.println("");
    System.out.print("Números ímpares: ");
    for(x=1;x<=30;x++){
    if(n[x]%2>0){
    System.out.printf("%d ",n[x]);
    }
    }
	}
}