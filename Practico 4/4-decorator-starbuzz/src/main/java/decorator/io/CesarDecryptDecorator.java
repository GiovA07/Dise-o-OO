package decorator.io;

import java.io.*;


public class CesarDecryptDecorator extends FilterInputStream {
  int code = 3;

  public CesarDecryptDecorator(InputStream in) {
    super(in);
  }

  @Override
  public int read() throws IOException {
    int c = in.read();
    return (c == -1 ? c : decryptText((char)c));
  }


  public int read(byte[] b, int offset, int len) throws IOException {
    int result = in.read(b, offset, len);
    for (int i = offset; i < offset+result; i++) {
      b[i] = (byte) decryptText((char)b[i]);
    }
    return result;
  }


  public char decryptText(char character) {
      return (char) (character - this.code);
  }
}
