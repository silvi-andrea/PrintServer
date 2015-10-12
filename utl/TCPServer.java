import java.net.*

public class TCPServer implements Runnable{
	static private ServerSocket port = new ServerSocket(9999);
	private boolean closedFlag = false;

	public void run(){
		while(!closedFlag){
			Socket connessione = port.accept();
			Print printer = new Print(connessione.getInputStream()); //creare classe print
			if(printer.print()>=0){

		}
	}

	public void closedConnection(){
		closedFlag=true;
	}

	public boolean status(){
		return !closedFlag;
	}
}
