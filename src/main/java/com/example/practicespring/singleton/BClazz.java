package com.example.practicespring.singleton;

public class BClazz {
    private final SocketClient socketClient;

    public BClazz() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
