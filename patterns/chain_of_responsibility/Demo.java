package chain_of_responsibility;

/* https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm
 * 
 * As the name suggests, the chain of responsibility pattern 
 * creates a chain of receiver objects for a request. This 
 * pattern decouples sender and receiver of a request based 
 * on type of request. This pattern comes under behavioral patterns.
 * 
 * In this pattern, normally each receiver contains reference to 
 * another receiver. If one object cannot handle the request 
 * then it passes the same to the next receiver and so on.
 */

public class Demo {
	
	private static AbstractLogger getChainOfLoggers(){
		
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
		
	}

	public static void main(String[] args) {
		
		AbstractLogger loggerChain = getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.INFO, "This is information.");
		
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is debug level information.");
		
		loggerChain.logMessage(AbstractLogger.ERROR, "This is error information");
	}

}
