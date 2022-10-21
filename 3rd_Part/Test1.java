package Lab_3_package;
import java.util.Random;

public class test1 {
	public static void main(String args[]) {
		
		Random rand = new Random();
		int[][] array = new int[5][5];
		int min = -10;
		int max = 10;
		int dif = max - min;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(dif + 1);
				array[i][j] += min;
			}
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
//		Find position of negative element in matrix. Print position of element.
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[j][i] < 0) {
					System.out.println("Position: "+ "[" +j +"]"+ "[" +i +"]"+ " Element: " + array[j][i]);
				}
			}
		}
	}
		
}
