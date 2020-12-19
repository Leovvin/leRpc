package org.example.lerpc.rpc.provider;

public class Bootstrap {

    public static Bootstrap create(){
        return new Bootstrap();
    }
    public Bootstrap register(String name){
        return this;
    }

    public void start(){

    }
}
