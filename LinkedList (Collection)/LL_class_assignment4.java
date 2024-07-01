import java.util.LinkedList;

class Queue {
	//Implement your logic here
	private LinkedList<String> queue;
    private int maxSize;

    public Queue(int maxSize) {
        this.queue = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public LinkedList<String> getQueue() {
        return this.queue;
    }

    public boolean isFull() {
        return this.queue.size() == this.maxSize;
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public boolean enqueue(String data) {
        if (!isFull()) {
            this.queue.addLast(data);
            return true;
        }
        return false;
    }

    public boolean dequeue() {
        if (!isEmpty()) {
            this.queue.removeFirst();
            return true;
        }
        return false;
    }
}

class Tester {

	public static void main(String arga[]){
		Queue queue= new Queue(5);
		
		queue.enqueue("Emily");
		queue.enqueue("Lily");
		queue.enqueue("Rachel");
		queue.enqueue("Rose");
		
		queue.dequeue();
		queue.dequeue();
	
		System.out.println(queue.getQueue());
	}
}