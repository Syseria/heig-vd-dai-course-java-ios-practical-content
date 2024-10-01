package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Readable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * A class that reads binary files. This implementation reads the file byte per byte. It manages the
 * file input stream properly with a try-catch-finally block.
 */
public class BinaryFileReader implements Readable {

  @Override
  public void read(String filename) {
    try (InputStream is = new FileInputStream(filename)) {
      int c;
      while ((c = is.read()) != -1) {
        System.out.print(c);
      }
    } catch (IOException e) {
      System.out.println("Exception: " + e);
    }
  }
}
