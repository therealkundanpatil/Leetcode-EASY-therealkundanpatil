package easy;

/**
 *  LeetCode Easy
 *  
 *  Id: 190			Reverse Bits
 *  
 *  Time Complexity : O(n)
 *  
 *  Space Complexity : O(n)
 *  
 *  @author Kundan
 *
 */
public class ReverseBits {
    public int reverseBits(int n) {
        long number = n;
        //Convert to unsigned long if the original number is negative
        if(n < 0){
            number = Integer.toUnsignedLong(n);
        }
        String binaryNString = Long.toBinaryString(number);
        //Find out minimum padding required to make 32 bit length string
        int paddingLength = 32 - binaryNString.length();
        
        StringBuilder sb = new StringBuilder("");
        while(paddingLength != 0){
            sb.append("0");
            paddingLength--;
        }
        binaryNString = sb.toString() + binaryNString;
        
        //Reverse the string
        StringBuilder binaryOutputStringBuilder = new StringBuilder("");
        for(int i = 32 - 1; i >= 0; i--){
            binaryOutputStringBuilder.append(binaryNString.charAt(i));    
        }
        
        String binaryOutputString = binaryOutputStringBuilder.toString();
        
        //Calculate the integer
        long result = 0;
        for(int i = 32 - 1, j = 0 ; i >= 0; i--, j++ ){
            if(binaryOutputString.charAt(i) == '1'){
                result += (int)Math.pow(2,j);
            }
            
        }
        
        // Edge case
        if(binaryOutputString.charAt(0) == '1'){
            return (int)result + 1;
        }
        else{
            return (int)(result);    
        }
    }
}
