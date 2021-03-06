
import java.net.*;
import java.io.*;
import java.util.*;


class  ChatServer
{

	protected final int port = 8001;
	ServerSocket server = null;
	Socket child = null;

	HashMap<String, PrintWriter> hm;

	public ChatServer() {
		ChatServerThread chatSverThrd;
		Thread thread;
		
		try {
			server = new ServerSocket( port );

			System.out.println( "************** 채팅 서버 ***********" );
			System.out.println( "클라이언트의 접속을 기다립니다." );

			hm = new HashMap<String, PrintWriter>();

			
			while( true ) {

				child = server.accept();

				if( child != null ) {
					chatSverThrd = new ChatServerThread( child, hm );
					thread = new Thread( chatSverThrd );
					thread.start();
				}
			}
		}

		catch ( Exception e )	{
			e.printStackTrace();
		}
	}



	public static void main(String[] args) 

	{
		new ChatServer();
	}

}



