package day02;

public class Sum {
	
	public static int getSum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {20, 10, 30};
		
		System.out.println(getSum(arr1));
		
	}

}
