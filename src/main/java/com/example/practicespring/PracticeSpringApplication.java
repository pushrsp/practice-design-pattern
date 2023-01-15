package com.example.practicespring;

import com.example.practicespring.adapter.Electronic110V;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeSpringApplication {

    public static void main(String[] args) {
        /* 싱글톤
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();
        */

        /* 어댑터
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V cleanerAdapter = new SocketAdapter(cleaner);
        connect(cleanerAdapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
        */

        /* 프록시
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();

        IBrowser browser1 = new BrowserProxy("www.naver.com");
        browser1.show();
        browser1.show();
        browser1.show();
        browser1.show();
        browser1.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );

        aopBrowser.show();
        System.out.println("loading time: " + end.get());

        aopBrowser.show();
        System.out.println("loading time: " + end.get());
        */

        /* 데코레이터
        ICar audi = new Audi(1000);
        audi.showPrice();

        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();
        */
    }

    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }

}
