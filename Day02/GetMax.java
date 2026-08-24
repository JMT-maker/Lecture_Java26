package day02;

public class getMax {
	public static int getMax(int[] arr) {
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] {20, 10, 30};
		System.out.println(getMax(arr1));
	}

}
