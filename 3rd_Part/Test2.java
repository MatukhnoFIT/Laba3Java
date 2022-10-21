package Lab_3_package;
import java.util.Random;

public class test2 {
	public static void main(String args[]) {
		
//		init Matrix square matrix!!
		int[][] array = new int [4][4];
		Random rand = new Random();
		int min = 1;
		int max = 9;
		int dif = max - min;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(dif + 1);
				array[i][j] += min;
			}
		}
//		Output Matrix
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
//		Product elements of main diagonal of square matrix!!
		int next = 0; 
		int product = 1;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] == array[i][next]  ) {
					product *= array[i][j];
					break;
				}
			}
			next++;
		}
		System.out.println("Добуток елементів головної діагоналі: "+product);
	}
}
