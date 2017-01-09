import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// Äàäåí âè å ìàñèâà int[] array. Ñúçäàéòå íîâ ìàñèâ, ñ åëåìåíòèòå îò
		// ïúðâèÿ, íî áåç ÷èñëîòî 6
		int lenghtArray = 0;
		int[] array = { 6, 4, 5, 5, 6, 4, 3, 4, 7, 6 };
		// Öèêúë for, ÷ðåç êîéòî ñå îïðåäåëÿ äúëæèíàòà íà íîâèÿ ìàñèâ.
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 6) {
				lenghtArray++;
			}
		}
		// Ñúçäàâàíå íà íîâèÿ öèêúë
		int[] array2 = new int[lenghtArray];
		int j = 0;
		// Öèêúë for, ÷ðåç êîéòî ñå ïðèñâîÿâàò ñòîéíîñòèòå ðàçëè÷íè îò 6.
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 6) {
				array2[j] = array[i];
				j++;
			}
		}
		System.out.println("Íà÷àëåí ìàñèâ: " + Arrays.toString(array));
		System.out.println("Ìàñèâ áåç ÷èñëîòî 66: " + Arrays.toString(array2));
	}

}
