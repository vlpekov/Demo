import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// ����� �� � ������ int[] array. �������� ��� �����, � ���������� ��
		// ������, �� ��� ������� 6
		int lenghtArray = 0;
		int[] array = { 6, 4, 5, 5, 6, 4, 3, 4, 7, 6 };
		// ����� for, ���� ����� �� �������� ��������� �� ����� �����.
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 6) {
				lenghtArray++;
			}
		}
		// ��������� �� ����� �����
		int[] array2 = new int[lenghtArray];
		int j = 0;
		// ����� for, ���� ����� �� ���������� ����������� �������� �� 6. 
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 6) {
				array2[j] = array[i];
				j++;
			}
		}
		System.out.println("������� �����: " + Arrays.toString(array));
		System.out.println("����� ��� ������� 6: " + Arrays.toString(array2));
	}

}
