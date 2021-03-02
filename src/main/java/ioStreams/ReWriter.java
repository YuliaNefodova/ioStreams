package ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReWriter {

    public void reWriter( String pathIn, String pathOut) throws IOException {
        FileInputStream fileIn = new FileInputStream(pathIn);
        FileOutputStream fileOut = new FileOutputStream(pathOut);
        while (fileIn.available() > 0) {
            int oneByte = fileIn.read();
            fileOut.write(oneByte);
        }
        fileIn.close();
        fileOut.close();
    }

}
