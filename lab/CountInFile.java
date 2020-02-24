package lab;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//lab6 exercise 6
public class CountInFile {
	public static void main(String[] args) {
		CountInFile count = new CountInFile();
		count.ui();
	}

	public void ui() {
		String path = "E:\\capgemini\\file\\workspace\\cap-file.txt";
		File file = new File(path);
		count(file);
	}

	public void count(File file) {
		try (InputStream inputStream = new FileInputStream(file);
				Reader reader = new InputStreamReader(inputStream);) {
			int read, lineCount = 0, wordCount = 0, characterCount = 0;
			while ((read = reader.read()) > 0) {
				char readCharacter = (char) read;
				if (readCharacter == '\n') {
					lineCount++;
					wordCount++;
				} else if (readCharacter == ' ') {
					wordCount++;
				} else {
					characterCount++;
				}
			}
			System.out.println(
					"Character Count: " + characterCount + " Word Count: " + wordCount + " Line Count: " + lineCount);

		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}
