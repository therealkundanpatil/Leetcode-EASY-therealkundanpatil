package easy;

public class Maximum_Repeating_SubString {
	public static int maxRepeating(String sequence, String word) {
        int count = 0;
        String result = word;
        while(true){
            if(sequence.contains(result)){
                count++;
                result += word;    
            }
            else{
                break;
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		String sequence = "ababc";
		String word = "ab";
		System.out.println(maxRepeating(sequence, word));
	}
}
