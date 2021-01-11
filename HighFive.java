package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode Easy
 * 
 * Id:   High Five
 * 
 * Time Complexity : O(n log(n) )
 * 
 * Space Complexity : O(n)
 * 
 * @author Kundan
 *
 */
class Student {
	int id;
	List<Integer> scores;

	public Student(int id) {
		this.id = id;
		scores = new ArrayList<>();
	}

	public void addScore(int score) {
		scores.add(score);
	}

	public int getTopFiveAvg() {
		int sum = 0;
		Collections.sort(scores, Collections.reverseOrder());
		for (int i = 0; i < 5; i++) {
			sum += scores.get(i);
		}
		return sum / 5;
	}
}

public class HighFive {
	public int[][] highFive(int[][] items) {
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		for (int i = 0; i < items.length; i++) {
			if (studentMap.containsKey(items[i][0])) {
				Student student = studentMap.get(items[i][0]);
				student.addScore(items[i][1]);
				studentMap.put(items[i][0], student);
			} else {
				Student student = new Student(items[i][0]);
				student.addScore(items[i][1]);
				studentMap.put(items[i][0], student);
			}
		}
		int[][] scores = new int[studentMap.size()][2];
		int index = 0;
		for (int key : studentMap.keySet()) {
			scores[index][0] = key;
			scores[index][1] = studentMap.get(key).getTopFiveAvg();
			index++;
		}

		return scores;
	}

}
