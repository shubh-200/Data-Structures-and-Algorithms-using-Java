//Divide_ex1
class Tester {
	
	public static int[] getMaxMin(int arr[], int low, int high) { 
	    if (low == high) {
	        return new int[]{arr[low], arr[low]};
	    }

	    if (high == low + 1) {
	        if (arr[low] > arr[high]) {
	            return new int[]{arr[low], arr[high]};
	        } else {
	            return new int[]{arr[high], arr[low]};
	        }
	    }

	    int mid = (low + high) / 2;
	    int[] leftResult = getMaxMin(arr, low, mid);
	    int[] rightResult = getMaxMin(arr, mid + 1, high);

	    int overallMax = Math.max(leftResult[0], rightResult[0]);
	    int overallMin = Math.min(leftResult[1], rightResult[1]);
	    
	    return new int[]{overallMax, overallMin};
	} 
	  
	public static void main(String args[]) { 
	    int arr[] = {1000, 10, 5, 1, 2000}; 

	    int[] maxMin = getMaxMin(arr, 0, arr.length - 1);
	    
	      System.out.println("Minimum value is "+ maxMin[1]); 
	 	  System.out.println("Maximum value is "+ maxMin[0]); 
	} 
}
