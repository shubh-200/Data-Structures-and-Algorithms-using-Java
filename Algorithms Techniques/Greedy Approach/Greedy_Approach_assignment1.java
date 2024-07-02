class Tester {
	
	public static int findSwapCount(String inputString)  { 
		int imbalance = 0;
		int swapCount = 0;

		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);

			if (ch == '(') {
				imbalance++;
			} else {
				imbalance--;
			}

			if (imbalance < 0) {
				swapCount++;
				imbalance = 1;
			}
		}
		
		return swapCount;
    } 
  
    public static void main(String args[])  { 
        String inputString = "())()("; 
        System.out.println("Number of swaps: "+findSwapCount(inputString)); 
    } 

}