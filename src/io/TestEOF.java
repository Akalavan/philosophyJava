package io;

import java.io.*;

public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("E:/Users/Akalavan/IdeaProjects/philosophyJava/src/io/TestEOF.java")));
        while (in.available() != 0) {
            System.out.print((char)in.readByte());
        }
    }
}
