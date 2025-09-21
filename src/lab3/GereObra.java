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
}