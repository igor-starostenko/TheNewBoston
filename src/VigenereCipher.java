import java.util.Scanner;
import java.util.Arrays;

public class VigenereCipher {
	public static String [] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public static int amount = 2;
	public static String encrypted = "";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String parole = scan.nextLine();
		encrypted = encrypt(parole, amount);
		parole = decrypt(encrypted, amount);
	}

	//Encryption using Vigenere Ciphere method;
	public static String encrypt(String parole, int amount) {
		String[] paroleChars = parole.split("");
		String encrypted = "";
		for (int n = 0; n < parole.length(); n++){
			if (Character.isLetter(paroleChars[n].charAt(0))){
				int c = Arrays.asList(alpha).indexOf(paroleChars[n].toLowerCase());
				int encryptedChar = (c + amount) % alpha.length;
				//System.out.println(alpha[encryptedChar]);
				encrypted += alpha[encryptedChar];
			} else {
				encrypted += paroleChars[n];
			}
		}
		System.out.println(encrypted);
		return encrypted;
	}
	
	//Decryption using Vigenere Ciphere method;
	public static String decrypt(String encrypted, int amount) {
		String[] paroleChars = encrypted.split("");
		String parole = "";
		for (int n = 0; n < encrypted.length(); n++){
			if (Character.isLetter(paroleChars[n].charAt(0))){
				int c = Arrays.asList(alpha).indexOf(paroleChars[n].toLowerCase());
				//System.out.println(c-amount);
				if ((c-amount)>0){
					//System.out.println("first");
					parole += alpha[(c - amount) % alpha.length];
				} else {
					//System.out.println("second");
					parole += alpha[((alpha.length + (c - amount)) % alpha.length)];
			}
			} else {
				parole += paroleChars[n];
		}	
		}
		System.out.println(parole);
		return parole;
	}
}
