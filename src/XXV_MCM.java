import java.util.Scanner;

public class XXV_MCM {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two doubles:");
		Double a = scan.nextDouble();
		Double b = scan.nextDouble();
		//power
		System.out.println("Power: " + a + ", " + b + " = " + Math.pow(a, b));
		//absolute
		System.out.println("Absolute: " + a + " equals" + Math.abs(a));
		System.out.println("Absolute: " + b + " equals" + Math.abs(b));
		//max
		System.out.println("Max: " + a + ", " + b + " = " + Math.max(a, b));
		//min
		System.out.println("Min: " + a + ", " + b + " = " + Math.min(a, b));
		//ceil
		System.out.println("Ceil: " + a + " equals" + Math.ceil(a));
		System.out.println("Ceil: " + b + " equals" + Math.ceil(b));
		//floor
		System.out.println("Floor: " + a + " equals" + Math.floor(a));
		System.out.println("Floor: " + b + " equals" + Math.floor(b));
	}
}
