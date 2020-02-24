package lab;

import java.util.Scanner;

//lab5 exercise1
public class TrafficLightSimulator {
	public static void main(String[] args) {
		TrafficLightSimulator example = new TrafficLightSimulator();
		example.ui();
	}

	public void ui() {
		Scanner read = new Scanner(System.in);
		System.out.println("Select one of the light: (Red/Yellow/Green) ");
		String light = read.next();
		light = light.toLowerCase();
		if (light.equals("red")) {
			System.out.println("Stop");
		} else if (light.equals("yellow")) {
			System.out.println("Ready");
		} else if (light.equals("green")) {
			System.out.println("Go");
		} else {
			System.out.println("Select Appropriate option, and try again later");
		}
		read.close();
	}
}
