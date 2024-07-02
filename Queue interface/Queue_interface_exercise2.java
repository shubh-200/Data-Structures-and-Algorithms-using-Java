//Qint_ex2
import java.util.Deque;
import java.util.ArrayDeque;

class Tester {
    
    public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
		//Implement your logic here and change the return statement accordingly
		if (inputStack == null || inputStack.isEmpty()) {
            return inputStack;
        }

        int smallest = Integer.MAX_VALUE;
        for (Integer value : inputStack) {
            if (value < smallest) {
                smallest = value;
            }
        }

        int count = 0;
        for (Integer value : inputStack) {
            if (value == smallest) {
                count++;
            }
        }

        Deque<Integer> tempStack = new ArrayDeque<>();
        Deque<Integer> resultStack = new ArrayDeque<>();

        while (!inputStack.isEmpty()) {
            int value = inputStack.pop();
            if (value != smallest) {
                tempStack.push(value);
            }
        }

        while (!tempStack.isEmpty()) {
            resultStack.push(tempStack.pop());
        }

        for (int i = 0; i < count; i++) {
            resultStack.push(smallest);
        }

        return resultStack;
	}

	public static void main(String[] args) {
		
		Deque<Integer> inputStack = new ArrayDeque<Integer>();
		inputStack.push(10);
		inputStack.push(8);
		inputStack.push(5);
		inputStack.push(12);
		inputStack.push(5);
	
		Deque<Integer> updatedStack = changeSmallest(inputStack);
		
		System.out.println("Stack After Modification:");
		for (Integer value : updatedStack)
			System.out.println(value);
	}
}