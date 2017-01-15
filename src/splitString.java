import java.util.Scanner;
public class splitString {
	static String text;
	
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
		text = input.nextLine();
		 
		if (text.contains(" ")){
			
			while(text.contains(" ")){
				System.out.println(text.substring(0, text.indexOf(" ")));
				text = text.replaceFirst(text.substring(0, text.indexOf(" ")+1), "");
			}
			System.out.println(text);
			
		} else {
			System.out.println("There are no spaces in the string");
		}
		
		
	}
}
