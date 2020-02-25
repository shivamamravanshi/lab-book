package lab;

import java.io.File;
//lab6 exercise7
public class FileOperation {
	public static void main(String[] args) {
		FileOperation example = new FileOperation();
		example.ui();
	}

	public void ui() {
		String file = "E:\\capgemini\\file\\workspace";
		File f = new File(file);
		System.out.println("name :" + f.getName());
		System.out.println("path:" + f.getAbsolutePath());
		System.out.println("exists:" + f.exists());
		System.out.println("is file:" + f.isFile());
		System.out.println("is dir:" + f.isDirectory());
		System.out.println("readable :" + f.canRead());
		System.out.println("writable:" + f.canWrite());
	}
}
