import java.util.Scanner;

public class palindromes {

	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Put the word:");
		String word = input.nextLine();
		String[] arr = word.split("");
		//System.out.println(arr[0]+arr[1]);
		Integer n = 0;
		Integer m = 0;
		boolean x = true;
		for (n = 0, m = arr.length-1; n < arr.length; n++, m--){
			System.out.println(arr[n] + " =? " + arr[m]);
			if (!arr[n].equals(arr[m])){
				System.out.println("false");
				x = false;
			}
		}
		System.out.println("Palindrome? " + x);
		
		
		
	}
}
