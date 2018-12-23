package question95;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] numbers = {0,1,2,3,4,5,6,7,8,9};
		int index = search1(numbers, 8);
		int index2 = search2(numbers, 0, 10, 5);
		System.out.println(index);
		System.out.println(index2);
	}
	
	public static int search1(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length - 1;
		while (start <= end) {
			int indexMiddle = (start + end) / 2;
			if (numbers[indexMiddle] == target) {
				return indexMiddle;
			} else {
				if (numbers[indexMiddle] > target) {
					end = indexMiddle - 1;
				} else {
					start = indexMiddle + 1;
				}
			}
		}
		return -1;
	}
	
	public static int search2(int[] numbers, int start, int end, int target) {
		if (start <= end) {
			int middle = start + (end - start) / 2;
			if (numbers[middle] == target) {
				return middle;
			} else {
				if (numbers[middle] < target) {
					return search2(numbers, middle+1, end, target);
				} else {
					return search2(numbers, start, middle-1, target);
				}
			}
		}
		return -1;
	}
}
