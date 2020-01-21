package com.epam.larionov;

import com.epam.larionov.service.DemoService;
import com.epam.larionov.service.impl.DemoServiceImpl;

public class Main {
    public static void main(String[] args) {
        DemoService demoService = new DemoServiceImpl();
        demoService.service();
    }
}
