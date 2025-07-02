package Udemy;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayTest {
    public static void main(String[] args) throws IOException {
        CharArrayWriter cw = new CharArrayWriter();
        cw.write("hello ");
        cw.write("world");
        String s = cw.toString();
        System.out.println(s);
    }
}
