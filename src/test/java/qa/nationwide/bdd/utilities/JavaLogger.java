package qa.nationwide.bdd.utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLogger {

	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void log(String msg) {
		LOGGER.log(Level.INFO, msg);
	}
}
