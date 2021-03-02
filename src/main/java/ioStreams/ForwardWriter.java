package ioStreams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ForwardWriter {

    public void forwardWriter (String text, String pathIn, String pathOut) throws IOException {
        text += (char) 32;
        ByteArrayOutputStream byteArrayOutStream = new ByteArrayOutputStream();
        byteArrayOutStream.write(text.getBytes(StandardCharsets.UTF_8));
        FileInputStream fileIn = new FileInputStream(pathIn);
        while(fileIn.available() > 0)
            byteArrayOutStream.write(fileIn.read());
        fileIn.close();
        FileOutputStream fileOut = new FileOutputStream(pathOut);
        byteArrayOutStream.writeTo(fileOut);
        fileOut.close();
        byteArrayOutStream.close();
    }
}
