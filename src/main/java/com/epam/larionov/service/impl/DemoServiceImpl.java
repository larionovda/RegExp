package com.epam.larionov.service.impl;

import com.epam.larionov.service.DemoService;
import com.epam.larionov.service.ProcessRegExp;
import com.epam.larionov.service.WorkWithFile;

public class DemoServiceImpl implements DemoService {

    private ProcessRegExp processRegExp = new ProcessRegExpImpl();
    private WorkWithFile workWithFile = new WorkWithFileImpl();

    public void service() {
        String string = workWithFile.readFromFile();
        workWithFile.writeToFile(processRegExp.processString(string));
    }
}
