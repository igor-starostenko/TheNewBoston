import java.util.Scanner;

class XV_UMP {
	public static void main (String[] args){
		
		Scanner in = new Scanner(System.in);
		tuna tunaObject = new tuna ();
		
		System.out.println("Enter your name here:");
		String name = in.nextLine();
		
		tunaObject.simplemessage(name);
	}

}
