import java.io.PrintStream;
import java.time.LocalDateTime;

public class Log {
	private static final Log INSTANCE = new Log();
	private PrintStream logFile = null;
	private PrintStream destination = System.out;

	private Log() {
	}

	public static Log getInstance() {
		return INSTANCE;
	}

	public void logging(String message) {
		this.destination.println(LocalDateTime.now().toString() + ": " + message);
	}

	public Log toConsole() {
		this.destination = System.out;
		return INSTANCE;
	}

	public Log toFile() throws Exception {
		if (logFile == null) {
			this.destination = System.out;
			throw new Exception("Nenhum arquivo configurado. ");
		} else {
			this.destination = this.logFile;
		}
		return INSTANCE;
	}

	public Log toFile(String fileName) throws Exception {
		this.logFile = new PrintStream(fileName, "UTF-8");
		this.destination = this.logFile;
		return INSTANCE;
	}

	public void closeLogFile() {
		this.destination = System.out;
		this.logFile.close();
		this.logFile = null;
	}

}
