import java.util.Scanner;

public class XXIII_CIR {

	public static void main(String[] args) {
		double rate = .01;
		int day;
		int time;
		double amount = 10000;
		double interest = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of days: ");
		try {time = input.nextInt();
		} catch (java.util.InputMismatchException e){
			time = 0;
		}
		for(day = 1 ; day <= time ; day++){
			//amount = amount*(rate+1);
			interest = amount*Math.pow(1+rate,day);
			
			System.out.println(day+". "+interest);
		}
		System.out.println("Interest equals: " + interest);

	}

}
