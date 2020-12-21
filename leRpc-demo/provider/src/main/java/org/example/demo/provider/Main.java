package org.example.demo.provider;

import org.example.lerpc.rpc.provider.Bootstrap;

public class Main {
    public static void main(String[] args){
        Bootstrap bootstrap = Bootstrap.create();
        try {
            bootstrap.bindPort(8080).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
