public class MainServer{

	public static void main(String args[]){

		//Create printer Server Socket
		int port=9999;
		ServerSocket printerSocket = new ServerSocket(port);

		System.out.println("Server is listening on port:"+port);

		while (true) { //while !printSocket.isNull()
			Socket connSocket = printerSocket.accept();
			BufferedReader dataIn = new BufferedReader(new InputStreamReader(connSocket.getInputStream()));
			//@TODO printJob(datain.readLine())
			System.out.println("Printing...");

		}

		//Close all streams.
		dataIn.close();
		connSocket.close();
		printerSocket.close();
	}
}
