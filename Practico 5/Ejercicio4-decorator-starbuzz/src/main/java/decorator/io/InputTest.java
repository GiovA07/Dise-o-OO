package decorator.io;

import java.io.*;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		InputStream in = null;
		try {
			in = new CesarCipherDecorator(
					new BufferedInputStream(
						new FileInputStream("test.txt")));

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
