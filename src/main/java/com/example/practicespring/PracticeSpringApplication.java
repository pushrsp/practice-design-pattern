package com.example.practicespring;

import com.example.practicespring.singleton.AClazz;
import com.example.practicespring.singleton.BClazz;
import com.example.practicespring.singleton.SocketClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeSpringApplication {

    public static void main(String[] args) {
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();
        
//        SpringApplication.run(PracticeSpringApplication.class, args);
    }

}
