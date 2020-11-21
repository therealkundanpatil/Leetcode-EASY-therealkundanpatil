package easy;

import java.util.Stack;

/**
 * LeetCode Easy
 * 
 * 682 : BaseBall Game
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 * 
 * Stack implementation is also provided but commented out in the main code
 * 
 * @author Kundan
 *
 */
public class BaseBallGame {
	public int calPoints(String[] ops) {
		/*
		Stack<Integer> stackObj = new Stack<>();

		for (String op : ops) {
			if (op.equals("C")) {
				stackObj.pop();
			} else if (op.equals("D")) {
				stackObj.push(2 * stackObj.peek());
			} else if (op.equals("+")) {
				int number1 = (!stackObj.isEmpty()) ? stackObj.peek() : 0;
				int value = stackObj.pop();
				int number2 = (!stackObj.isEmpty()) ? stackObj.peek() : 0;
				stackObj.push(value);
				stackObj.push(number1 + number2);
			} else {
				stackObj.push(Integer.parseInt(op));
			}
			System.out.println(stackObj);
		}

		int answer = 0;
		while (!stackObj.isEmpty()) {
			answer += stackObj.pop();
		}

		return answer;
		*/
		int res = 0;
        int[] scores = new int[ops.length];
        int index = 0;
        
        for(int i = 0; i < ops.length; i++) {
            switch(ops[i]) {
                case "+":
                    scores[index] = scores[index-1] + scores[index-2];
                    index++;
                    break;
                    
                case "D":
                    scores[index] = 2*scores[index-1];
                    index++;
                    break;
                    
                case "C":
                    index--;
                    break;
                    
                default:
                    scores[index++] = Integer.parseInt(ops[i]);
                    break;
            }
        }
        
        for(int i = 0; i < index; i++) {
            res += scores[i];
        }
        
        return res;
    }
}
