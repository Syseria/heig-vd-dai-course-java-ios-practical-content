package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Writable;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * A class that writes binary files. This implementation writes the file byte per byte. It manages
 * the file output stream properly with a try-catch-finally block.
 */
public class BinaryFileWriter implements Writable {

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
