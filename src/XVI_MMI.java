import java.util.Scanner;

class XVI_MMI {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		tuna tunaObject = new tuna();
		System.out.println("Enter name of your first girlfriend:");
		String temp = input.nextLine();
		tunaObject.setName(temp);
		tunaObject.saying();
	}

}
