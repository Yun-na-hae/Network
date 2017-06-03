import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HalliServer {
	public static void main(String[] args){
		
		ServerSocket server = null;
		
		try{
			server = new ServerSocket(6000);
			while(true){
				Socket client = server.accept();
				
				if(client != null){
					//Thread thread = new Thread(new GameThread.start());
					
				}
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
