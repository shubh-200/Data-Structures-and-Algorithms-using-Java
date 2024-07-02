//MS_ex1
class Tester {

	public static void mergeSort(int[] elements, int size) {
		//Implement your logic here
		if (size < 2) {
            return; 
        }
        
        int mid = size / 2;
        int[] left = new int[mid];
        int[] right = new int[size - mid];

        System.arraycopy(elements, 0, left, 0, mid);
        System.arraycopy(elements, mid, right, 0, size - mid);

        mergeSort(left, mid);
        mergeSort(right, size - mid);

        merge(elements, left, right, mid, size - mid);
	}

	public static void merge(int[] elements, int[] left, int[] right, int leftMerge, int rightMerge) {
        //Implement your logic here
        int i = 0, j = 0, k = 0;

        while (i < leftMerge && j < rightMerge) {
            if (left[i] <= right[j]) {
                elements[k++] = left[i++];
            } else {
                elements[k++] = right[j++];
            }
        }

        while (i < leftMerge) {
            elements[k++] = left[i++];
        }

        while (j < rightMerge) {
            elements[k++] = right[j++];
        }
	}

	public static void displayArray(int[] elements) {
	    for(int element:elements) 
	        System.out.print(element+" ");
	    System.out.println();
	}
	
	public static void main(String[] args) {
		int[] elements = { 95, 56, 20, 98, 34, 77, 80 };

		System.out.println("Given Array:");
		displayArray(elements);
		
		mergeSort(elements, elements.length);
		
		System.out.println("Sorted Array:");
		displayArray(elements);

	}

}