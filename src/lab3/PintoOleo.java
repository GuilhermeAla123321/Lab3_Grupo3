package lab3;

public class PintoOleo extends Pintura {
	private String tipoTela;

	public PintoOleo (String titulo, String autor, int anoC, String tecnica, String tipoTela) {
		super(titulo,autor,anoC,tecnica);
		this.tipoTela =tipoTela;
	}

	public void setTipoTela(String tipoTela) {
		this.tipoTela = tipoTela;
	}

	public String getTipoTela() {
		return tipoTela;
	}

	@Override
	public String toString() {
		return "PintoOleo [tipoTela=" + tipoTela + "]";
	}
	
	
}
