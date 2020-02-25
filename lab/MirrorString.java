package lab;

import java.util.Scanner;

//lab6 exercise3
public class MirrorString {
	public static void main(String[] args) {
		MirrorString example = new MirrorString();
		example.ui();
	}

	public void ui() {
		Scanner readString = new Scanner(System.in);
		String inputString = readString.next();
		String mirrorString = getImage(inputString);
		System.out.println(mirrorString);
		readString.close();
	}

	public String getImage(String string) {
		String mirrorString = "";
		StringBuffer copyOfString = new StringBuffer(string);
		copyOfString.reverse();
		mirrorString = string + "|" + copyOfString.toString();
		return mirrorString;
	}
}
