import java.util.Scanner;
import java.util.Arrays;
public class AddTwoMatrix {
	public static void main(String []args) {
		Scanner keybroad  = new Scanner(System.in);
		System.out.println("Enter column: ");
		int col = keybroad.nextInt();
		System.out.println("Enter row: ");
		int row = keybroad.nextInt();
		
		int[][] array1 = new int[row][col];
		int[][] array2 = new int[row][col];
		int[][] array3 = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				array1[i][j] = 1;
				array2[i][j] = 2;
			}
		}
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				array3[i][j] = array1[i][j] + array2[i][j];
				System.out.print(array3[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.exit(0);
	}
}
