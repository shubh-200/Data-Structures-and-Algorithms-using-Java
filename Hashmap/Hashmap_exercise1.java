//Hash_ex1
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	
    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
		//Implement your logic here and change the return statement accordingly
		String maxScorer = null;
        String minScorer = null;
        Double maxScore = Double.MIN_VALUE;
        Double minScore = Double.MAX_VALUE;
        
        for (Entry<String, Double> entry : studentMarks.entrySet()) {
            String student = entry.getKey();
            Double marks = entry.getValue();
            
            if (marks > maxScore) {
                maxScore = marks;
                maxScorer = student;
            }
            
            if (marks < minScore) {
                minScore = marks;
                minScorer = student;
            }
        }
        
        Map<String, Double> maxMinScorers = new HashMap<>();
        maxMinScorers.put("Max Marks (" + maxScorer + ")", maxScore);
        maxMinScorers.put("Min Marks (" + minScorer + ")", minScore);
        
        return maxMinScorers;
	}

}

class Tester {

	public static void main(String args[]) {
		Map<String, Double> studentMarks = new HashMap<String, Double>();
	    studentMarks.put("Lily", 90.0);
		studentMarks.put("Robin", 68.0);
		studentMarks.put("Marshall", 76.5);
		studentMarks.put("Neil", 67.0);
		studentMarks.put("Ted", 92.0);
		
		Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);
		
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}
}