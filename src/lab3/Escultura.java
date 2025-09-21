package lab3;

public class Escultura extends Obra{
	private String material;

	public Escultura(String titulo, String autor, int anoC, String material) {
	        super(titulo, autor, anoC); 
	        this.material = material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	

}
