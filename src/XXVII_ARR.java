import java.util.Scanner;

public class XXVII_ARR {

	private static Scanner input;

	public static void main (String[] args){
		int num = 0;
		int arr[] = {1,3,4,5,6,9,10};
		
		input = new Scanner(System.in);
		System.out.println("Input the number you want to scan:");
		num = input.nextInt();
		
		for (int n=0; n < arr.length; n++){
			//System.out.println(n);
			for (int m=0; m < arr.length; m++){
				if(num == arr[n]+arr[m]){
					System.out.println(n + ". " + arr[n] + " " + arr[m]);
				}
			}
			
		}
		
	}
}
