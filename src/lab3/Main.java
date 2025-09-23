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
                    ler.nextLine();
            		
            		System.out.println("Qual o tipo de obra( pintura ou escultura) :");
            		String tipo = ler.nextLine();
            		
            		 Obra novaObra = null;
            		
            		if(tipo.equalsIgnoreCase("pintura")) {
            			System.out.print("Pintura ou Pintura oleo :");
            			String tipoPint = ler.nextLine();
            			
            			
            			if(tipoPint.equalsIgnoreCase("pintura")) {
            				System.out.println("Qual a técnica usada :");
            				String tecn = ler.nextLine();
            				novaObra = new Pintura(titulo, autor, anoC, tecn);
            				gere.adicionarObras(novaObra);

            			} else {
            				System.out.print("Qual o tipo de tela usado?- ");
            				String tipoTela = ler.nextLine();
            				
            				novaObra = new Pintura(titulo, autor, anoC, tipoTela);
            				gere.adicionarObras(novaObra);
            				
          	
            			}
            		} else {
            			System.out.println("Qual o material usado na escultura?- ");
            			String material = ler.nextLine();
            			
            			novaObra = new Pintura(titulo, autor, anoC, material);
        				gere.adicionarObras(novaObra);
         
            		}
                
                     break;
            	case 2:
            		 gere.imprimirDetalhes();
                     break;
                     
            	case 3:
            		System.out.print("Qual o título da obra?- ");
            		String tituloObra = ler.nextLine(
                     break;
            }
		} while (opcao != 6); 
	}
}
           
