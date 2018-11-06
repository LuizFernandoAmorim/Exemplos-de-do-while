package doWhile;
import java.util.*;
public class List {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> notas = new ArrayList<Integer>();
		int loop, opcao;
		System.out.printf("Inser��o de notas:\n");
		
		for(int i = 0; i < 4; i ++){
			System.out.printf("Digite a %d� nota: ",i + 1);
			notas.add(entrada.nextInt());
		}
		System.out.printf(notas.toString());  // imprime todo array
		do{
			System.out.printf("\nDigite 1 para adicionar uma nova nota: ");
			System.out.printf("\nDigite 2 para remover uma nota: ");
			opcao = entrada.nextInt();  // interage com o uuario  variavel opcao
			switch(opcao)
			{
			case 1:  // loop para adicionar
				System.out.printf("Informe a nota adicionada: ");
				notas.add(entrada.nextInt());
				System.out.printf("Nota adicionada com sucesso! ");
				System.out.printf("\n");
				System.out.printf(notas.toString());
				break;
			case 2:  // loop para remover
				System.out.printf("Informe o �dice da nota a ser removida: ");
				notas.remove(entrada.nextInt()-1);
				System.out.printf("Nota adicionada com sucesso! ");
				System.out.printf("\n");
				System.out.printf(notas.toString());
				break;
				default:
					System.out.println("Op��o invalido");
			}
			System.out.printf("\ndeseja continuar o programa ? Se sim digite 1 - caso n�o, digite 2");
			loop = entrada.nextInt();  // interage com usuario a escolha de retornar
			while(loop != 1 & loop != 2) {
				System.out.print("Tentar novamente");
				loop = entrada.nextInt();
			}
		}while(loop == 1);  // retorna ou n�o ao inicio 'do"
		System.out.printf("Fim do Programa...");
	}
}
