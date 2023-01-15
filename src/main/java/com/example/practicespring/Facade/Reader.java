package com.example.practicespring.Facade;

public class Reader {
    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        String format = String.format("Reader %s로 연결", fileName);
        System.out.println(format);
    }

    public void fileRead() {
        String format = String.format("Reader %s 읽음", fileName);
        System.out.println(format);
    }

    public void findDisconnect() {
        String format = String.format("Reader %s 연결 종료", fileName);
        System.out.println(format);
    }
}
