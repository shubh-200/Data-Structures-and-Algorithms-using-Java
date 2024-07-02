//Greedy_ex1
class Tester {

	public static int findMaxActivities(int start[], int finish[]) { 
        int n = start.length;

        boolean[] selected = new boolean[n];

        selected[0] = true;
        int count = 1; 
        int lastFinishTime = finish[0];

        for (int i = 1; i < n; i++) {
            if (start[i] >= lastFinishTime) {
                selected[i] = true;
                lastFinishTime = finish[i];
                count++;
            }
        }
        
        return count;
	} 
	       
	public static void main(String[] args) { 
        int start[] =  {1, 3, 0, 5, 8, 5}; 
    	int finish[] =  {2, 4, 6, 7, 9, 9};
    	    
    	System.out.println("Maximum number of activities: "+findMaxActivities(start, finish)); 
    }
}
