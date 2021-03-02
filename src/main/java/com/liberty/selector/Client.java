package com.liberty.selector;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;

public class Client {
    public static void main(String... args) throws Exception {
        SelectorProvider provider = SelectorProvider.provider();
        SocketChannel socketChannel = provider.openSocketChannel();
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 8100));
        ByteBuffer bb = ByteBuffer.allocate(48);
        bb.put("this is a channel".getBytes());
        bb.flip();
        while (bb.hasRemaining()){
            socketChannel.write(bb);
        }
        socketChannel.close();
    }
}
