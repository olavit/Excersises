package ru.javamethods.glava10.ex1a;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Demo {
    public static void main(String[ ] args) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get("text.txt"), Charset.defaultCharset());

        PrintWriter out = new PrintWriter("text1.txt");
        Collections.reverse(lines);
        out.println(lines);
        out.close();
        }
    }


