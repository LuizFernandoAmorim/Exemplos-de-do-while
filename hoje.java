package doWhile;
import java.util.*;

public class hoje{
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		ArrayList<String> produtos = new ArrayList<>();
		int opcao, loop, indice;
		
		do {
			System.out.println("1");
			System.out.println("0");
			opcao = entrada.nextInt();
			
			switch(opcao) {
			
			case 1:
				System.out.println("inserir");
				produtos.add(entrada.nextLine());
				
			break;
			
			case 2:
				System.out.println("Remover pelo índice");
				indice = ler.nextInt();
				produtos.remove(indice);
				break;
				default:
			}
			System.out.println("Para continuar digite 1");
			loop = entrada.nextInt();
		}while(loop == 1);
		System.out.println("Fim do programa");
	}
}
	
