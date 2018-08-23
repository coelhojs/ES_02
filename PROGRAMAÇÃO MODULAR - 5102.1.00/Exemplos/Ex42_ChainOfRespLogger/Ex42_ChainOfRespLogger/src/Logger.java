
public abstract class Logger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERRO = 3;
	protected int nivel;
	// proximo elemento na cadeia de responsabilidades
	protected Logger proximoLogger;

	public void setProximo(Logger proximoLogger) {
		this.proximoLogger = proximoLogger;
	}

	public void log(int nivel, String mensagem) {
		if (this.nivel <= nivel) {
			escrever(mensagem);
		}
		if (proximoLogger != null) {
			proximoLogger.log(nivel, mensagem);
		}
	}

	abstract protected void escrever(String mensagem);
}
