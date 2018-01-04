package ru.schepin.lambda;

import java.io.IOException;
import java.io.Reader;

public class Example4Exception {
    interface LambdaException {
        boolean ioAction(Reader rdr) throws IOException;
    }

    public static void main(String[] args) {
        double[] values = {1.0, 2.0, 3.0, 4.0};

        LambdaException myIO = (rdr -> {
            int ch = rdr.read();
            return true;
        });
    }
}
