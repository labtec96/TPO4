package Server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Server
{
	private static Charset charset = Charset.forName("ISO-8859-2");
	private static final int BSIZE = 1024;
	private ByteBuffer bbuf = ByteBuffer.allocate(BSIZE);
	private StringBuffer reqString = new StringBuffer();
	private ServerSocketChannel serverSocketChannel = null;
	private Selector selector = null;
	private String host = "localhost";
	private int port = 6154;

	public Server()
	{
		try
		{
			serverSocketChannel = ServerSocketChannel.open();
			serverSocketChannel.configureBlocking(false);
			serverSocketChannel.socket().bind(new InetSocketAddress(host, port));
			selector = Selector.open();
			serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

		} catch (Exception exc)
		{
			exc.printStackTrace();
		}
		System.out.println("Server started");
		serviceConnections();
	}

	private void serviceConnections()
	{
		while (true)
		{
			try
			{
				selector.select();

				Set<SelectionKey> keys = selector.selectedKeys();
				Iterator<SelectionKey> iter = keys.iterator();
				while (iter.hasNext())
				{
					SelectionKey key = (SelectionKey) iter.next();
					iter.remove();
					if (key.isAcceptable())
					{
						SocketChannel sc = serverSocketChannel.accept();
						sc.configureBlocking(false);
						sc.register(selector, SelectionKey.OP_READ);
						continue;
					}
					if (key.isReadable())
					{
						SocketChannel sc = (SocketChannel) key.channel();
						serviceRequest(sc);
						continue;
					}
				}
			} catch (IOException e)
			{
				System.out.println("Problem with selector");
				e.printStackTrace();
				continue;
			}
		}

	}

	private void serviceRequest(SocketChannel sc) throws IOException
	{
		if (!sc.isOpen()) 
			return;
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		int numRead = -1;
		numRead = sc.read(buffer);
		byte[] data = new byte[numRead];
		System.arraycopy(buffer.array(), 0, data, 0, numRead);
		System.out.println("Got: " + new String(data));
		sc.close();
	}
}
