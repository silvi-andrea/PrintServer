import java.net.*

public class TCPServer implements Runnable{
	static private ServerSocket port = new ServerSocket(9999);
	private boolean closedFlag = false;
	private Log log=new Log();

	public void run(){
		while(!closedFlag){
			Socket connessione = port.accept();
			Print printer = new Print(connessione.getInputStream()); //creare classe print
			short int res=printer.print();
			if(res>=0){
				log.logAdd("info","stampa avvenuta con successo da "+connesione.getInetAddress().getHostAddress());
			}
			else{
				log.logAdd("error","errore n. "+res+" da "+connesione.getInetAddress().getHostAddress());
			}
		}
		connessione.close();
	}

	public void closedConnection(){
		closedFlag=true;
	}

	public boolean status(){
		return !closedFlag;
	}
}
