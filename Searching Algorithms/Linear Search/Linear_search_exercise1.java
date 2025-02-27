//LS_ex1
class Tester {
	
	public static int searchElement(int[] elements, int elementToBeSearched) {
		//Implement your logic here and change the return statement accordingly
		for (int i = 0; i < elements.length; i++) {
            if (elements[i] == elementToBeSearched) {
                return i + 1; 
            }
        }
        return -1; 
	}
	
	public static void main(String[] args) {
		int[] elements = { 76, 24, 78, 98, 1 };
		int elementToBeSearched = 78;
		
		int numberOfIterations = searchElement(elements, elementToBeSearched);
		
		if (numberOfIterations == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found! Number of iterations required to find the element : " + numberOfIterations);
	}
	
}