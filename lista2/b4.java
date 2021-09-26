package Java.lista2;
import java.util.Scanner;
public class b4 {
    public static void main(String[] args) {
		int x,med,som,nota,notb,notc,notd;
		Scanner sc = new Scanner(System.in);
        System.out.println("Insira a nota A: ");
        nota=sc.nextInt();
        System.out.println("");
        System.out.println("Insira a nota B: ");
        notb=sc.nextInt();
        System.out.println("");
        System.out.println("Insira a nota C: ");
        notc=sc.nextInt();
        System.out.println("");
        System.out.println("Insira a nota D: ");
        notd=sc.nextInt();
        System.out.println("");

        som=nota+notb+notc+notd;
        med=som/4;
        System.out.print("Média: ");
        System.out.printf("%d ",med);
        if(med<3){
        System.out.print("- Reprovado");
        }
        else if(med>3 && med<7){
            System.out.print("- Exame");
            }
           else if(med>7){
                System.out.print("- Aprovado");
                }
        }
 }

