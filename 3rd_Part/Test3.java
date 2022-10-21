package Lab_3_package;
import java.util.Arrays;
import java.util.Random;
public class test3 {
	public static void main(String args[]) {
		
		int[][] array = new int[4][4];
		array(array);
		mid_stat(array);
	}
	public static int[][] array(int[][] array){
		Random rand = new Random();
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				array[i][j] = rand.nextInt(10);
			}
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.printf(array[i][j] + " ");
			}
			System.out.println();
		}
		return array;
	}
	public static void mid_stat(int[][] array) {
		int next = 0;
		int count = 0;
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i][j] == array[i][next]) {
					sum += array[i][j];
					count++;
					break;
				}
			}
			next++;
		}
		System.out.println("Сума елементів головної діагоналі: " + sum);
		int mid_stat = sum / count;
		System.out.println("Середнє арифметичне: " + mid_stat);
		
//		Count of elements that smaller than mid_stat
		int state = 0;
		for(int i = 0; i < 1; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] < mid_stat) {
					state++;
				}
			}
		}
		System.out.print("Кількість елементів в першому рядку менших за Середнє арифметичне: " + state);
	}
}

