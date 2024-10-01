package ch.heigvd.dai.ios.text;

import ch.heigvd.dai.ios.Writable;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * A class that writes text files. This implementation write the file byte per byte. It manages the
 * file writer properly with a try-catch-finally block.
 */
public class TextFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    try (OutputStream os = new FileOutputStream(filename);
         Writer writer = new OutputStreamWriter(os, StandardCharsets.UTF_8)) {
      for (int i = 0; i < sizeInBytes; ++i) {
        writer.write(i);
      }
    } catch (IOException e) {
      System.out.println("Exception: " + e);
    }
  }
}
