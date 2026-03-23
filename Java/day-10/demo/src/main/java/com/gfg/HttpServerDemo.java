package com.gfg;

import com.sun.net.httpserver.*;

import java.net.InetSocketAddress;
import java.io.IOException;

public class HttpServerDemo {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress("localhost",9090),0);
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.start();
    }
}
