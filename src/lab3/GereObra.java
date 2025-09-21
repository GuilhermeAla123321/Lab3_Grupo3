package lab3;

import java.util.ArrayList;
public class GereObra {
    private ArrayList<Obra> obras;

    public GereObra() {
        obras = new ArrayList<>();
    }
    
	public void adicionarObras(String titulo, String autor, int anoC) {
		for ( Obra o : obras) {
			if( o.getTitulo().equalsIgnoreCase(titulo) && o.getAutor().equalsIgnoreCase(autor)) {
				System.out.println("Autor e titulo ja existete");
				return;
			}
			obras.add (new Obra(titulo,autor,anoC));
		}
	} 
	public void imprimirDetalhes() {
		if(obras.isEmpty()) {
			System.out.print("Nenhuma obra encontrada.");
		} else {
			for(Obra o : obras) {
				System.out.println("Autor :" + o.getAutor() + ", Título :" + o.getTitulo() + ", Ano de criação : " + o.getAnoC());
			}
		}
	}
	public void pesquisarPorTitulo(String titulo) {
	    boolean encontrada = false;

	    for (Obra o : obras) {
	        if (o.getTitulo().equalsIgnoreCase(titulo)) {
	            System.out.println(o); 
	            encontrada = true;
	            break;
	        }
	    }

	    if (!encontrada) {
	        System.out.println("Obra de arte não encontrada.");
	    }
	}
	
	public void imprimirTituloAutor(String tela) {
        for (Obra o : obras) {
            if (o instanceof PintoOleo) {
                PintoOleo po = (PintoOleo) o; 
                if (po.getTipoTela().equalsIgnoreCase(tela)) {
                    System.out.println("Título: " + po.getTitulo() + " | Autor: " + po.getAutor());
                }
            }
        }
    }
	public void imprimirDetObraPorTipo() {
		int totalPintura = 0;
		int totalOleo = 0;
		int totalEscultura = 0;
		
		System.out.println("Pinturas");
		for (Obra o : obras) {
			if (o instanceof PintoOleo) {
				continue;
				}
			else if (o instanceof Pintura) 
				System.out.println(o);
			    totalPintura++;
			    }
		  System.out.println("Total de Pinturas: " + totalPintura);
		
		  System.out.println("PintoOleo");
		  for (Obra o : obras) {
			  if(o instanceof PintoOleo){
				  System.out.print(o);
				  totalOleo++;
			  }
		  System.out.println("Total de pintoOleos: " + totalOleo);
		  }
		  
		  System.out.println("Esculturas");
		  for (Obra o : obras) {
			  if (o instanceof Escultura) {
					System.out.print(o);
					totalEscultura++;
					}
		  System.out.println("Total de esculturas : " + totalEscultura);
		  }
		  }
	}


				
		  
		  
		  
		
				  
		
			
	

