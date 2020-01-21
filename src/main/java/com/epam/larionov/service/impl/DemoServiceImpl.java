package com.epam.larionov.service.impl;

import com.epam.larionov.service.DemoService;
import com.epam.larionov.service.WorkWithFile;

public class DemoServiceImpl implements DemoService {

    WorkWithFile workWithFile = new WorkWithFileImpl();

    public void service() {

    }
}
