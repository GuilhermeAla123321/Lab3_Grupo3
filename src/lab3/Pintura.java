package lab3;


public class Pintura extends Obra {
    private String tecnica;

    public Pintura(String titulo, String autor, int anoC, String tecnica) {
        super(titulo, autor, anoC);
        this.tecnica = tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

	public String getTecnica() {
		return tecnica;
	}

	@Override
	public String toString() {
		return "Pintura [tecnica=" + tecnica + "]";
	}

	
    
}
