/*
Class: Log.java
Description: PrinterServer and PrinterClient logger
Author: zgabe, andrea-silvi
*/

public class Log() implements Runnable {

	//Private variables
	private boolean verbose;
	private String lastLog;
	private String logFile="logs.txt";
	private PrintWriter writer;
	
	//Constructors
	public Log () {
		new Log(false,logFile);
	}

	public Log(boolean verbose) {
		new Log(this.verbose,logFile);
	}

	public Log(boolean verbose, String logFile) {
		verbose = this.verbose;
		if(logFile != null) logFile = this.logFile;
		try {
		    writer = new PrinterWriter(logFile, "ASCII");
		} catch(NullPointException e){ /*Do Something Smart*/ }
	}

	//Print methods
	
	private void log(String log) {
	   if(isVerbose()) System.out.println(log);
	   writer.println(log) 
	   lastLog=log;
	}
	
	public void logErr(int errN, String errMsg) {
		String log = Date.getTime()+" Err["+errN+"]: "+errMsg;
        log(log);
	}

	public void logWarn(String warnMsg) {
		String log = Date.getTime()+" Warn: "+warnMsg;
        log(log);
	}

	public void logStat(String statMsg) {
	    String log = Date.getTime()+" Stat: "+statMsg;
        log(log);
	}

	//Getters and Setters
	public String getLogFile() {
	    return logFile;
	}
	
	public String getLastLog() {
	    return lastLog();
	}

	public boolean isVerbose() {
		return verbose;
	}

	//Run method
	public run() {
    //TODO CLOSE WRITER!!!!
	}
	
	
	
}
