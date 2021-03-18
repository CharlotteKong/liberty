
# ByteBuffer
![ByteBuffer](io/ByteBuffer.png)

- 两种内存分配方式，一种是堆内存，一种是堆外内存，不过在channel中最终还是会转换为堆外内存，如果使用场景是直接用于传输，用堆外内存比较好