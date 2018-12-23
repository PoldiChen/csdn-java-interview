package question094;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] numbers = {1,3,4,2,2,6,9,7};
		numbers = sort(numbers);
		for (int number : numbers) {
			System.out.println(number);
		}
	}
	
	public static int[] sort(int[] numbers) {
		for (int i=0; i<numbers.length; i++) {
			for (int j=i+1; j<numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;
	}

}
