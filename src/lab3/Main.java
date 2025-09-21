package lab3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		GereObra gere = new GereObra();
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\n----- MENU -----");
            System.out.println("1 - Registar obras ");
            System.out.println("2 - Imprimir detalhes das obras ");
            System.out.println("3 - Pesquisa de uma obra pelo título ");
            System.out.println("4 - Impressão do título e do autor das pinturas a óleo ");
            System.out.println(" 5 - Impressão de todos os detalhes das obras de arte agrupadas por tipo");
            System.out.println(" 6 - Sair ");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();
            ler.nextLine();
            
            switch(opcao) {
            	case 1:
            		 System.out.print("Título: ");
                     String titulo = ler.nextLine();

                     System.out.print("Autor: ");
                     String autor = ler.nextLine();

                     System.out.print("Ano de criação: ");
                     int anoC = ler.nextInt();

                     gere.adicionarObras(titulo, autor, anoC);
                     break;
            	case 2:
            		 gere.imprimirDetalhes();
                     break;
            	case 3:
            		
                     break;
            }
		} while (opcao != 6); 
	}
}
           
