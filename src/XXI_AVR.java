import java.util.Scanner;

public class XXI_AVR {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 1;
		double dig = 0;
		double next = 0;
		double average = 0;
		boolean ver = false;
		
		System.out.println("Let's start?");
		try {ver = input.nextBoolean();
		} catch (java.util.InputMismatchException e){
		}
		
		System.out.println(ver == false ? "The End" : "Let's go...");
		while (ver == true){
			System.out.println("Input "+num+" digit:");
			next = input.nextInt();
			average = (dig+next)/num;
			dig = dig+next;
			System.out.println("Average is: " + average);
			num++;
			System.out.println("Do you want to continue?");
			try {ver = input.nextBoolean();
			} catch (java.util.InputMismatchException e){
			ver = false;
			}
			System.out.println(ver == false ? "The End" : "");
		}
	}

}
