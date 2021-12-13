package alpha;

import org.apache.logging.log4j.*;

public class A {
	private static Logger log= LogManager.getLogger(A.class.getName());

	public static void main(String[] args) {
					
				log.debug("I am debuging");
					log.info("Object found");
				log.error("Error found");
				
				log.fatal("Fatal");
			}
		}


	
