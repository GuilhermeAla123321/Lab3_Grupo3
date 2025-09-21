package lab3;

public class Obra {
	private String titulo;
	private String autor;
	private int anoC;
	
	public Obra(String titulo, String autor, int anoC) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoC = anoC;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoC() {
		return anoC;
	}
	public void setAnoC(int anoC) {
		this.anoC = anoC;
	}
	
	
}



