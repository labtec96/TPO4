package Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Main
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		InetSocketAddress hostAddress = new InetSocketAddress("localhost", 6154);
		SocketChannel client = SocketChannel.open(hostAddress);
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		buffer.put("asdsad".getBytes());
		buffer.flip();
		client.write(buffer);
		client.close();
	}

}
