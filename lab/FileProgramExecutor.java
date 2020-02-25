package lab;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//lab 9
public class FileProgramExecutor {
	public static void main(String[] args) {
		FileProgramExecutor example = new FileProgramExecutor();
		example.ui();
	}

	public void ui() {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		String inputPath = "E:\\capgemini\\file\\workspace\\source.txt";
		String outputPath = "E:\\capgemini\\file\\workspace\\target.txt";
		try (
				Reader reader = new FileReader(inputPath);
				Writer writer = new FileWriter(outputPath);
				) {
			Runnable thread1 = new CopyDataThread(reader, writer);
			executor.submit(thread1);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
