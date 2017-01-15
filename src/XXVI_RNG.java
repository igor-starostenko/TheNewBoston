import java.util.Random;

public class XXVI_RNG {
	public static void main (String[] args){
		Random ran = new Random();
		Integer num;
		
		for (int count = 1; count <= 10; count++){
			num = 1+ran.nextInt(6);
			//num = 1+Math.abs(ran.nextInt());
			System.out.println(num);
		}
	}
}
