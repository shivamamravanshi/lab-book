package lab;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//lab6 exercise2
public class ReadFile {
	public static void main(String[] args) {
		ReadFile read = new ReadFile();
		read.ui();
	}

	public void ui() {
		String filePath = "E:\\capgemini\\file\\workspace\\cap-file.txt";
		File inputFile = new File(filePath);
		try (InputStream inputStream = new FileInputStream(inputFile);
				Reader reader = new InputStreamReader(inputStream);
				OutputStream outputStream = System.out;
				Writer writer = new OutputStreamWriter(outputStream);) {
			int read, lineNumber = 1;
			System.out.print(lineNumber + ": ");
			while ((read = reader.read()) > 0) {
				char readCharacter = (char) read;
				if (readCharacter == '\n') {
					lineNumber++;
					System.out.print(lineNumber + ": ");
					continue;
				}
				writer.write(readCharacter);
				writer.flush();
			}

		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}
