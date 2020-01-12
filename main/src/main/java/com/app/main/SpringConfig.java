package com.app.main;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.app") // spring wie od teraz ze ma skanowac paczke org.example
// i jej podpaczki w poszukiwaniu klas oznaczonych @Component i rejestrowac w kontenerze spring
// beny czyli obiekty tych klas
public class SpringConfig {

    // kiedy chcesz recznie stworzyc bean dla twojej klasy bo nie masz do niej dostepu
    // piszesz w klasie konfiguracyjnej metode ktora ma zwrocic typ beana, ktory cie interesue
    // nazwa beana w kontenerze jest nazwa metody czyli singer1
   /* @Bean*//*(name = "xxxx") - tak mozesz nadac inna nazwe*//*
    // @Primary
    @Qualifier("s1")
    public Singer singer1() {
        return new SingerImpl();
    }

    @Bean*//*(name = "xxxx") - tak mozesz nadac inna nazwe*//*
    @Qualifier("s2")
    public Singer singer2() {
        return new SingerImpl2();
    }

    @Bean
    public SingerTester2 singerTester2() {
        return new SingerTester2(singer2());
    }*/
}
