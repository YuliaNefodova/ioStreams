package ioStreams;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class InTheEndWriter {

    public void inTheEndWriter(String text, String pathIn, String pathOut) throws IOException {

        ByteArrayOutputStream byteArrayOutStream = new ByteArrayOutputStream();

        FileInputStream fileIn = new FileInputStream(pathIn);
        while(fileIn.available() > 0)
            byteArrayOutStream.write(fileIn.read());
        fileIn.close();

        text = text.replace(text, (char) 32 + text);
        byteArrayOutStream.write(text.getBytes(StandardCharsets.UTF_8));

        FileOutputStream fileOut = new FileOutputStream(pathOut);
        byteArrayOutStream.writeTo(fileOut);

        fileOut.close();
        byteArrayOutStream.close();
    }
}
