package doWhile;
import java.util.ArrayList;
import java.util.*;
public class Compacto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao, loop;
		do {
			System.out.println("### Menu Principal ###");
			System.out.println("Escolha através deste Menu, qual questão quer ver primeiro");
			System.out.println("(1) para a 1ª Questão");
			System.out.println("(2) para a 2ª Questão");
			System.out.println("(3) para a 3ª Questão");
			System.out.println("(4) para a 4ª Questão");
			System.out.println("(0) para sair");
			opcao = entrada.nextInt();
		
		switch(opcao) {
		
		case 1:
				int[] valores = new int[6];
				int soma = 0;
				
				System.out.print("Digi1te os valores !\n");
				for(int a = 0; a < 6; a ++) {
					System.out.printf("%dº ",a + 1);
					valores[a] = entrada.nextInt();
					soma = soma + valores[a];
				}
				System.out.printf("\nA soma total dos valores é %d: \n\n", soma);
				break;
				
		case 2:
			
	    		String[][] meses = new String[2][6];
	    		int i = 1;
  			
	    		System.out.println("Insira os Meses:");
	    		for(int a = 0; a < 2; a ++) {
	    			for(int a1 = 0; a1 < 6; a1 ++) {
	    				System.out.print(i + "º Mes: ");
	 	    		    meses[a][a1] = entrada.next();
	 	    		    i++;
		    		  }
	    		}
	    		i = 1;
	    		for(int a = 0; a < 2; a ++) {
	    			for(int a1 = 0;a1 < 6; a1 ++) {
		    			if(i == 4 | i == 6 | i == 9 | i == 11) {
		    				System.out.printf("\t((%s))\t", meses[a][a1]);
			    		}else {
			    			System.out.printf("\t %s \t", meses[a][a1]);
			    		}
			    		i++;
			    	}
			    	System.out.println();
				}
	    		break;
		
		case 3:
			
	    		double[] valor = {5.59, 6.58, 1.24, 3.32};
	    		System.out.println("Numeros inseridos" + Arrays.toString(valor));
	    		
			
	    		Arrays.sort(valor);
	    		System.out.print("\nOrdem Crescente" + Arrays.toString(valor));
	    		break;
	    		
	    case 4:
	    		ArrayList<String> produtos = new ArrayList<>();
	    		int opcao1, loop1 = 0;
			
    			do {
	    			System.out.print("Escolha as opções no Menu\n");
	    			System.out.println("Digite 1, Para Acrescentar um produto");
	    			System.out.println("Digite 2, Para Remover um produto");
	     			System.out.println("Digite 0, Para Deixar de brincar");
	    			opcao1 = entrada.nextInt();
	     		switch(opcao1)
		    		{
		 		
	    			case 1:
		    			int a = 1;
	 	    			while(a >= 1) {
		    				System.out.print("\nInsira o nome do produto a ser inserido: ");
		    				produtos.add(entrada.next());
		    				System.out.println(produtos.toString());
		    				System.out.print("\nPara continuar Inserindo, digite (1) ou (0) para sair");
		    				a = entrada.nextInt();
		    	     		}
		    			break;
				
				case 2:
					a = 1;
					while(a >= 1) {
		    			System.out.print("\nInsira o índice do produto que queira remover: ");
		    			System.out.println(produtos.toString());
		    			produtos.remove(entrada.nextInt());
		    			System.out.println(produtos.toString());
		    			System.out.print("\nPara continuar Removendo, digite (1) ou (0) para sair");
			    		a = entrada.nextInt();
		 	    		}
					break;
					default:
						System.out.print("Opção inválida");
						
		        		}
	        			System.out.print("Digite (1) para entrar na Lista de Produtos Novamente / ou (0) para sair");
		        		loop1 = entrada.nextInt();
		        		}while(loop1 == 1);
	              }
	           	System.out.print("\n\nDigite (1) para continuar analizando as outras Questões e (0) para sair");
	           	loop = entrada.nextInt();
          }while(loop == 1);
	}
}
