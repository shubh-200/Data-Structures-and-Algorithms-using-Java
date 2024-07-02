import java.util.ArrayList;
import java.util.List;

class Tester {
    
	public static int findWordSegments(List<String> wordsList, String inputString) {
        return findSegments(wordsList, inputString, 0);
    }

    private static int findSegments(List<String> wordsList, String inputString, int startIndex) {
        if (startIndex == inputString.length()) {
            return 1; 
        }

        int totalCount = 0;
        for (String word : wordsList) {
            int endIndex = startIndex + word.length();
            if (endIndex <= inputString.length() && inputString.substring(startIndex, endIndex).equals(word)) {
                totalCount += findSegments(wordsList, inputString, endIndex);
            }
        }

        return totalCount;
    }

	public static void main(String[] args){
	    List<String> wordsList = new ArrayList<String>();
	    wordsList.add("i");
	    wordsList.add("like");
	    wordsList.add("pizza");
	    wordsList.add("li");
	    wordsList.add("ke");
	    wordsList.add("pi");
	    wordsList.add("zza");

		String inputString = "ilikepizza";
		int count = findWordSegments(wordsList, inputString);
		System.out.println("Number of segments: "+count);
	}
}