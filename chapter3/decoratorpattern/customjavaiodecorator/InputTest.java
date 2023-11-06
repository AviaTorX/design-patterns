package chapter3.decoratorpattern.customjavaiodecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                    new FileInputStream("/home/shinigami/Github/design-patterns/chapter3/decoratorpattern/customjavaiodecorator/test.txt")
                )
            );

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }

            in.close();                          
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
