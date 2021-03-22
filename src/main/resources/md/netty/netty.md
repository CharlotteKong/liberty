- netty由ServerBootStrap/BootStrap、NioEventLoopGroup(boss、worker)、
NioEventLoop(connect[]、exector、thread、NioServerSocketChannel/NioSocketChannel(持有channel)、
SocketChannelPipeline(ChannelContext、ChannelHandler)、Unsafe(操作channel)组成。

- [五种IO模型](五种IO模型.md)