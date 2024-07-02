//Qint_2
import java.util.ArrayDeque;
import java.util.Deque;

class Tester {

    public static Deque<Character> updateStack(Deque<Character> inputStack) {
		//Implement your logic here and change the return statement accordingly
		Deque<Character> auxStack = new ArrayDeque<>();

        for (int i = 0; i < 3; i++) {
            auxStack.push(inputStack.removeLast());
        }

        while (!auxStack.isEmpty()) {
            inputStack.push(auxStack.pop());
        }
        
        return inputStack;
	}
	
	public static void main(String[] args) {
		
		Deque<Character> inputStack = new ArrayDeque<Character>();
		inputStack.push('E');
		inputStack.push('D');
		inputStack.push('C');
		inputStack.push('B');
		inputStack.push('A');
		
		Deque<Character> resultStack = updateStack(inputStack);
		
		System.out.println("The alphabets in updated stack are:");
		for(Character alphabet: resultStack)
		    System.out.println(alphabet);
	}
}