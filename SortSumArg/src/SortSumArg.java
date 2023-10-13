import java.util.Arrays;
import java.util.Scanner;
public class SortSumArg{
	public static void main(String args[]) {
		Scanner keybroad = new Scanner(System.in);
		
		System.out.print("Enter size of arrays: ");
		int size = keybroad.nextInt();
		
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = keybroad.nextInt();
		}
		int sum = 0;
		for(int i =0;i<size;i++) {
			sum += arr[i];
		}
		double arg = (double) sum/size;
		Arrays.sort(arr);
		System.out.println("Sorted Array"+Arrays.toString(arr));
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + arg);
		System.exit(0);
	}
}

