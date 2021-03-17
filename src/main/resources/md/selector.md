## selector
* selector类图

![selector类图](image/io/selector_uml.png)


![NioSocketChannel流程图](image/io/NioSocketChannel.png)

- netty由ServerBootStrap/BootStrap、NioEventLoopGroup(boss、worker)、
NioEventLoop(connect[]、exector、thread、NioServerSocketChannel/NioSocketChannel(持有channel)、
SocketChannelPipeline(ChannelContext、ChannelHandler)、Unsafe(操作channel)组成。