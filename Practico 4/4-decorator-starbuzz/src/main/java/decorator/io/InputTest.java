package decorator.io;

import java.io.*;

public class InputTest {
		public static void main(String[] args) throws IOException {
			int n = 3;
			int c;
			InputStream in = null;
			OutputStream out = null;

			try {
				// Encriptar el archivo y guardarlo en encrypted.txt
				in =  new CesarCipherDecorator(
						new BufferedInputStream(
							new FileInputStream("test.txt")), n);

				out = new BufferedOutputStream(new FileOutputStream("encrypted.txt"));

				while((c = in.read()) >= 0) {
					out.write(c);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (in != null) { in.close(); }
				if (out != null) { out.close(); }
			}

			try {
				// Desencriptar el archivo encrypted.txt y mostrarlo en consola
				in = new CesarDecryptDecorator(
						new BufferedInputStream(
							new FileInputStream("encrypted.txt")), n);

				while((c = in.read()) >= 0) {
					System.out.print((char)c);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (in != null) { in.close(); }
			}
		}
	}

// public static void main(String[] args) {
//     BufferedReader in = null;
//     try {
//         InputStream inputStream = new CesarCipherDecorator(
//                                         new BufferedInputStream(
//                                             new FileInputStream("test.txt")));
//         InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//         in = new BufferedReader(inputStreamReader);

//         int c;
//         while((c = in.read()) != -1) {
//             System.out.print((char)c);
//         }

//         int lines = 0;
//         while (in.readLine() != null) {
//             lines++;
//         }

//         System.out.println("Cantidad de líneas leídas: " + lines);

//     } catch (IOException e) {
//         e.printStackTrace();
//     } finally {
//         if (in != null) {
//             try {
//                 in.close();
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
