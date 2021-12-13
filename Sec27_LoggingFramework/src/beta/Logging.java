package beta;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;


public class Logging {

	private static Logger log= LogManager.getLogger(Logging.class.getName());
	
	public static void main(String[] args)
	{
		log.debug("I am debuging");
			log.info("Object found");
		log.error("Error found");
		
		log.fatal("Fatal");
	}
}
