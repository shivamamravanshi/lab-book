package lab;
//lab1 exercise4
public class CheckPower {
	public static void main(String[] args) {
		CheckPower check = new CheckPower();
		check.ui();
	}

	public void ui() {
		boolean flag = checkPower(8);
		if(flag==true) {
			System.out.println("Input is power of 2");
		}else {
			System.out.println("Input is not the power of 2");
		}
	}

	public boolean checkPower(int num) {
		int i=1;
		while(Math.pow(2, i)<=num) {
			i++;
		}
		if(Math.pow(2, i-1)==num) {
			return true;
		}
		return false;
	}
}
