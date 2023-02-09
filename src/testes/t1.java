package testes;
import java.util.Scanner;
public class t1 {

	public static void main(String[] args) {
		int parar=0;
		while(parar == 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe o primeiro número");
			float n1 = sc.nextFloat();
			System.out.println("Informe o segundo número");
			float n2 = sc.nextFloat();
			System.out.println("escolha a operação utilizada:\n(1)soma\n(2)sub\n(3)mult\n(4)div\n(5)trocar valores\n(6)sair");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println(soma(n1,n2)+"\n");
				break;
			case 2:
				sub(n1,n2);
				break;
			case 3:
				mult(n1,n2);
				break;
			case 4:
				div(n1,n2);
				break;
			case 5:
				div(n1,n2);
				break;
			case 6:
				parar++;
				break;
			default:
				System.out.println("Operação invalida, tente novamente");
			}
		}
	}
	public static float soma(float n1, float n2) {
		return(n1+n2);
	}
	public static float sub(float n1, float n2) {
		return(n1-n2);
	}
	public static float mult(float n1, float n2) {
		return(n1*n2);
	}
	public static float div(float n1, float n2) {
		return(n1/n2);
	}
}
