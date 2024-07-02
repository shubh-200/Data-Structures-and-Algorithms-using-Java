class Tester {

	public static void sortArray(int arr[]) {
		// Implement your logic here
		int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
	}

	public static int findMaxSum(int arr[], int m) {
		// Implement your logic here and change the return statement accordingly
		int n = arr.length;
        if (m > n) {
            return 0; 
        }
        int sum = 0;
        for (int i = n - m; i < n; i++) {
            sum += arr[i];
        }
        return sum;
	}

	public static int findMinSum(int arr[], int m) {
		// Implement your logic here and change the return statement accordingly
		int n = arr.length;
        if (m > n) {
            return 0; 
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		sortArray(arr);
		System.out.println("Maximum Sum for m=4: " + findMaxSum(arr, 4));
		System.out.println("Minimum Sum for m=3: " + findMinSum(arr, 3));
	}

}

