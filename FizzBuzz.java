package easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> toReturn = new ArrayList<>();
        
        for( int i = 1; i <= n; i++   ){
            if(i % 3 == 0 && i % 5 == 0){
                toReturn.add("FizzBuzz");
            }
            else if( i % 3 == 0){
                toReturn.add("Fizz");
            }
            else if (i % 5 == 0){
                toReturn.add("Buzz");
            }
            else{
                toReturn.add(Integer.toString(i));
            }
        }
        
        return toReturn;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fizzBuzz(15));
	}

}
