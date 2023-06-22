package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Calculator {
    public static void main()
    {
        Process process = null;
        try {
            process = new ProcessBuilder("C:\\Users\\Dell\\Downloads\\TestCalc.exe").start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream processInputStream = process.getInputStream();
        OutputStream processOutputStream = process.getOutputStream();

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(processOutputStream));

        BufferedReader reader = new BufferedReader(new InputStreamReader(processInputStream));
    }
}