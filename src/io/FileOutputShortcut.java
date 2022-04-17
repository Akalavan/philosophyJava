package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class FileOutputShortcut {

    static String file = "FileOutputShortcut.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("E:/Users/Akalavan/IdeaProjects/philosophyJava/src/io/FileOutputShortcut.java")));
        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null) {
            out.println(lineCount++ + ": " + s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
