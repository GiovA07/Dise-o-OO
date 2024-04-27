package decorator.io;

import java.io.*;

public class CaesarCipherInputStreamDecorator extends InputStream {
    private final InputStream inputStream;
    private final int key;

    public CaesarCipherInputStreamDecorator(InputStream inputStream, int key) {
        this.inputStream = inputStream;
        this.key = key;
    }

    @Override
    public int read() throws IOException {

    }

    public String encryptText(String text) {
        int n = 3;
        int cantLetters = 26;
        StringBuilder cifrado = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
          char character = text.charAt(i);
          if(isLower(character)) {
            if((character + n) < 'z')
              cifrado.append((char) (character + n));
            else
              cifrado.append((char) (character + n - cantLetters));

          } else if (isUpper(character)){
            if((character + n) < 'Z')
              cifrado.append((char) (character + n));
            else
              cifrado.append((char) (character + n - cantLetters));

          } else if(isSpace(character)) {
            cifrado.append(' ');
          } else {
            throw new IllegalArgumentException("El texto solo debe tener caracteres.");
          }
        }

        return cifrado.toString();
      }

      private boolean isLower(char c) {
        return c >= 'a' && c <= 'z';
      }

      private boolean isUpper(char c) {
        return c >= 'A' && c <= 'Z';
      }

      private boolean isSpace(char c) {
        return c == ' ';
      }

}
