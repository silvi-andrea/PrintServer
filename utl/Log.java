/*
Class: Log.java
Description: PrinterServer and PrinterClient logger
Author: zgabe, andrea-silvi
*/

public class Log() implements Runnable {

	//Private variables
	private boolean verbose;
	private String lastLog;
	private String logFile;
	private PrintWriter writer;

	//Constructors
	public Log () {
		new Log(false,"logs.txt");
	}

	public Log(boolean verbose) {
		new Log(this.verbose,"logs.txt");
	}

	public Log(boolean verbose, String logFile) {
		verbose = this.verbose;
		logFile = this.logFile;
		try {
		    writer = new PrinterWriter(logFile, "ASCII");
		} catch(NullPointException e){ /*Do Something Smart*/ }
	}

	//Print methods
	public void logErr(int errN, String errMsg) {
		String log = Date.getTime()+" Err["+errN+"]: "+errMsg;
		if(isVerbose()) System.out.println(log);
		writer.println(log)
	}

	public void logWarn(String warnMsg) {
		String log = Date.getTime()+" Warn: "+warnMsg;
		if(isVerbose()) System.out.println(log);
		writer.println(log);
	}

	public void logStat(String statMsg) {
	    String log = Date.getTime()+" Stat: "+statMsg;
	    if(isVerbose()) System.out.println(log);
		writer.println(log);
	}
	
	public String lastLog() {}

	//Getters and Setters
	public void setLogFile() {}
	public String getLogFile() {}

	public boolean isVerbose() {
		return verbose;
	}

	//Run method
	public run() {
    //TODO CLOSE WRITER!!!!
	}
	
	
	
}
