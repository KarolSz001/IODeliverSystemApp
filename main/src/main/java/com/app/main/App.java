package com.app.main;

import com.app.service.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App {



    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder();
        sb.append(" ----------------------------------------------------------------------------- \n");
        sb.append(" OrderingSys v1.0 07.12.2019 \n ");
        sb.append(" Karol Szot \n");
        sb.append(" ----------------------------------------------------------------------------- \n");
        System.out.println(sb.toString());

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ControlService controlService = context.getBean(ControlService.class);
        controlService.controlLoop();



    }
}
