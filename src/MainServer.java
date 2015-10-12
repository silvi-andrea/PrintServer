import java.lang.String;
import java.lang.Thread;

public class MainServer{
    public static void main(String args[]){
        Thread t = new Thread(new TCPServer());
        t.start();
    }
}