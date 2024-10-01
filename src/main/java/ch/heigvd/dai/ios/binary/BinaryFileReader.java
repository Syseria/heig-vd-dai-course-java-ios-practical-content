package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Readable;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * A class that reads binary files. This implementation reads the file byte per byte. It manages the
 * file input stream properly with a try-catch-finally block.
 */
public class BinaryFileReader implements Readable {

  @Override
  public void read(String filename) {
    // throw new UnsupportedOperationException("Please remove this exception and implement this method.");
    try (InputStream is = new FileInputStream(filename);
         Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);
         BufferedReader br = new BufferedReader(reader)) {
      int c;
      while ((c = br.read()) != -1) {
        System.out.print(c);
      }
    } catch (IOException e) {
      System.out.println("Exception: " + e);
    }
  }
}
