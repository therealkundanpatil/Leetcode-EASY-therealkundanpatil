package easy;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurances {
	public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet <Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int val : map.values()) {
            set.add(val);
        }
        
        return set.size() == map.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,1,1,3};
		System.out.println(uniqueOccurrences(arr));
	}

}
