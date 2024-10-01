package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Writable;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * A class that writes binary files. This implementation writes the file using a buffered output
 * stream. It manages the file output stream properly with a try-with-resources block.
 */
public class BufferedBinaryFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    try (OutputStream os = new FileOutputStream(filename);
         Writer writer = new OutputStreamWriter(os, StandardCharsets.UTF_8);
         BufferedWriter bw = new BufferedWriter(writer)) {
      for (int i = 0; i < sizeInBytes; ++i) {
        bw.write(i);
      }
    } catch (IOException e) {
      System.out.println("Exception: " + e);
    }
  }
}
