import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// Даден ви е масива int[] array. Създайте нов масив, с елементите от
		// първия, но без числото 6
		int lenghtArray = 0;
		int[] array = { 6, 4, 5, 5, 6, 4, 3, 4, 7, 6 };
		// Цикъл for, чрез който се определя дължината на новия масив.
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 6) {
				lenghtArray++;
			}
		}
		// Създаване на новия цикъл
		int[] array2 = new int[lenghtArray];
		int j = 0;
		// Цикъл for, чрез който се присвояват стойностите различни от 6. 
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 6) {
				array2[j] = array[i];
				j++;
			}
		}
		System.out.println("Начален масив: " + Arrays.toString(array));
		System.out.println("Масив без числото 6: " + Arrays.toString(array2));
	}

}
