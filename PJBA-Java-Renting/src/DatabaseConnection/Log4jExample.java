package DatabaseConnection;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Log4jExample {
	static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Log4jExample.class.getName());
	public static void main(String[] args) throws IOException, SQLException{
		log.debug("debug");
		log.info("info");
	}
}
