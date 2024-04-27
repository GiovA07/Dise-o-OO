package decorator.io;

public class CesarCracker {
  static int n = 3;
  static int cantLetters = 26;


  public String encryptText(String text) {
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

  public String decryptText(String text) {
    StringBuilder decrypt = new StringBuilder();

    for (int i = 0; i < text.length(); i++) {
      char character = text.charAt(i);
      if(isLower(character)) {
        if((character - n) >= 'a')
          decrypt.append((char) (character - n));
        else
          decrypt.append((char) (cantLetters - (character - n)));

      } else if (isUpper(character)){
        if((character - n) >= 'A')
          decrypt.append((char) (character - n));
        else
          decrypt.append((char)  (cantLetters - (character - n)));

      } else if(isSpace(character)) {
        decrypt.append(' ');
      } else {
        throw new IllegalArgumentException("El texto solo debe tener caracteres.");
      }
    }

    return decrypt.toString();
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
