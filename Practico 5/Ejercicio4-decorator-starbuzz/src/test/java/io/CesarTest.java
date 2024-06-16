package io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.*;


import decorator.io.CesarCipherDecorator;
import decorator.io.CesarDecryptDecorator;

public class CesarTest {
  @Test
  public void cypherTextTest() throws IOException{
    int c;
		InputStream in = null;

    StringBuilder str = new StringBuilder();

		try {
			in = new CesarCipherDecorator(
					new BufferedInputStream(
						new FileInputStream("test.txt")));

			while((c = in.read()) >= 0) {
				str.append((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) { in.close(); }
		}

		String res = str.toString();

    assertTrue("L#nqrz#wkh#Ghfrudwru#Sdwwhuq#dqg#KRZ#lw*v#xvhg#lq#wkh#MDYD1LR#sdfndjh1".equals(res));
  }

  @Test
  public void decryptTest() throws IOException{
    int c;
		InputStream in = null;

    StringBuilder str = new StringBuilder();

		try {
			in = new CesarDecryptDecorator(
					new BufferedInputStream(
						new FileInputStream("testEncrypt.txt")));

			while((c = in.read()) >= 0) {
				str.append((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) { in.close(); }
		}

  String res = str.toString();
  assertTrue("I know the Decorator Pattern and HOW it's used in the JAVA.IO package.".equals(res));
  }
}
