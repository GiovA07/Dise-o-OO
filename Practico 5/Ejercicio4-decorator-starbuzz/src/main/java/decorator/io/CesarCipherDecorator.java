package decorator.io;

import java.io.*;

public class CesarCipherDecorator extends FilterInputStream {
    int code = 3;

    public CesarCipherDecorator(InputStream in) {
		  super(in);
	  }

    @Override
    public int read() throws IOException {
      int c = in.read();
      return (c == -1 ? c : encryptText((char)c));
    }


    public int read(byte[] b, int offset, int len) throws IOException {
      int result = in.read(b, offset, len);
      for (int i = offset; i < offset+result; i++) {
        b[i] = (byte) encryptText((char)b[i]);
      }
      return result;
    }


    private char encryptText(char character) {
        return (char) (character + this.code);
    }
}
