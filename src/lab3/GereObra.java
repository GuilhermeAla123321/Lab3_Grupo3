package lab3;

import java.util.ArrayList;
public class GereObra {
    private ArrayList<Obra> obras;

    public GereObra() {
        obras = new ArrayList<>();
    }
    
    public boolean adicionarObras(Obra novaObra) {
    	for(Obra o : obras) {
            if (o.equals(novaObra)) { 
            	System.out.println("Já existe uma obra com o mesmo título e autor.");
    	            return false;
    		}
    	}
    	 obras.add(novaObra); 
    	    System.out.println("Obra registada com sucesso.");
    	    return true;
    }
    
    public void imprimirDetalhes() {
        if (obras == null || obras.isEmpty()) {
            System.out.println("Nenhuma obra encontrada.");
            return;
        }

        for (Obra o : obras) {
            System.out.println(o); 
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


				
		  
		  
		  
		
				  
		
			
	

