package com.example.practicespring.Facade;

public class Writer {
    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }


    public void fineConnect() {
        String format = String.format("Writer %s로 연결", fileName);
        System.out.println(format);
    }

    public void write() {
        String format = String.format("Writer %s로 쓰기", fileName);
        System.out.println(format);
    }

    public void fileDisconnect() {
        String format = String.format("Writer %s 연결 종료", fileName);
        System.out.println(format);
    }
}
