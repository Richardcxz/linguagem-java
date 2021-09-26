import java.util.Scanner;
public class a3 {
    private Scanner s;
    private double salAntigo, salNovo;

    public a3(){
        s= new Scanner(System.in);
        salAntigo=0;
        salNovo=0;
    }
    public void lersalario(){
        System.out.println("Informe o salario antigo: ");
        salAntigo= s.nextDouble();
    }
    public void csn(){
        salNovo= salAntigo*1.25;
    }
    public void impsalnovo(){
        System.out.printf("Salario antigo: %f\n",salAntigo);
        System.out.printf("Salario novo: %f\n",salNovo);
    }
    public static void main(String[] args) {
        a3 obj= new a3();

        obj.lersalario();
        obj.csn();
        obj.impsalnovo();
    }
}
