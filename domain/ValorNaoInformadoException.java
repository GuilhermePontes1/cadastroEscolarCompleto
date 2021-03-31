package domain;

public class ValorNaoInformadoException extends Exception {
	private static final long serialVersionUID = 1L;

	public ValorNaoInformadoException(String msg, Throwable err) {
		super(msg, err);
	}

}
