package Client;

import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class ClientServer
{
	private static final int BSIZE = 1024;
	private ServerSocketChannel serverSocketChannel = null;
	private Selector selector = null;
	private String host = "localhost";
	private int port;
	public ClientServer(int port)
	{
		this.port = port;
	}
}
