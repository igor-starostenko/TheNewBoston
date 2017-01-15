import java.util.Random;
import java.util.Arrays;

public class XXX_AEC {
	public static void main (String[] args){
		Random ran = new Random();
		int arr[] = new int[7];
		
		for (int counter=0;counter<1000000;counter++){
			arr[1+ran.nextInt(6)]++;
		}
		for (int value=1;value<arr.length;value++){
			System.out.println(value + "\t" + arr[value]);
		}
		
		Arrays.sort(arr);
		System.out.println("Max: "+arr[arr.length-1]);
        System.out.println("Min: "+arr[1]);
        double val = ((arr[arr.length-1] * 1.0f) / arr[1]-1)*100;
        System.out.println("Dif(%): " + val + "%");
	}
}
