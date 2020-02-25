package lab;

//lab8 exercise1
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileProgram {
	public static void main(String[] args) {
		FileProgram example = new FileProgram();
		example.ui();
	}

	public void ui() {
		String inputPath = "E:\\capgemini\\file\\workspace\\source.txt";
		String outputPath = "E:\\capgemini\\file\\workspace\\target.txt";
		try (
				Reader reader = new FileReader(inputPath);
				Writer writer = new FileWriter(outputPath);
				) {

			Runnable thread1 = new CopyDataThread(reader, writer);
			Thread thread = new Thread(thread1);
			thread.start();
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
