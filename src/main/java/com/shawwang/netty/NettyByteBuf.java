package com.shawwang.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;

public class NettyByteBuf {
    public static void main(String[] args) {
        ByteBuf byteBuf = Unpooled.buffer(10);
        System.out.println("byteBuf = " + byteBuf);
        for (int i = 0; i < 8; i++) {
            byteBuf.writeByte(i);
        }
        System.out.println("byteBuf = " + byteBuf);
        for (int i = 0; i < 5; i++) {
            System.out.println(byteBuf.getByte(i));
        }
        System.out.println("byteBuf = " + byteBuf);
        for (int i = 0; i < 5; i++) {
            System.out.println(String.valueOf(byteBuf.readByte()));
        }
        System.out.println("byteBuf = " + byteBuf);

        ByteBuf byteBuf2 = Unpooled.copiedBuffer("Hi，Shawwang！", CharsetUtil.UTF_8);
        if (byteBuf2.hasArray()){
            byte[] array = byteBuf2.array();
            System.out.println(new String(array,CharsetUtil.UTF_8));

            System.out.println("byteBuf2 = " + byteBuf2);

            System.out.println("byteBuf2 = " + byteBuf2.readerIndex());
            System.out.println("byteBuf2 = " + byteBuf2.writerIndex());
        }
    }
}
