package com.shawwang.bio;

import java.io.IOException;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",9000);

        socket.getOutputStream().write("HelloService".getBytes());
        socket.getOutputStream().flush();
        System.out.println("向服务端发送数据接收。。。");

        byte[] bytes = new byte[1024];
        socket.getInputStream().read(bytes);
        System.out.println("接收服务端数据：" + new String(bytes));
        socket.close();
    }
}
