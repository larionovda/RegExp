package com.epam.larionov.service.impl;

import com.epam.larionov.service.WorkWithFile;
import java.io.*;

public class WorkWithFileImpl implements WorkWithFile {

    private static final String NAME_FILE_FOR_WRITE = "files/new.txt";
    private static final String NAME_FILE_FOR_READ = "files/text.txt";
    private static final int MAX_COUNT_OF_NUMBER = 11;

    public String readFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(NAME_FILE_FOR_READ))) {
            return br.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public void writeToFile(String text) {
        try (FileOutputStream out = new FileOutputStream(NAME_FILE_FOR_WRITE);
             BufferedOutputStream bos = new BufferedOutputStream(out)) {

            byte[] buffer = changeArray(text).getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    private String changeArray(String string) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                stringBuilder.append(ch);
                count++;
                if (count == MAX_COUNT_OF_NUMBER) {
                    stringBuilder.append(" ");
                    count = 0;
                }
            }
        }
        return String.valueOf(stringBuilder);
    }
}
