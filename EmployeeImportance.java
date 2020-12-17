package easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Employee {
	public int id;
	public int importance;
	public List<Integer> subordinates;
}

/**
 * LeetCode Easy
 * Id: Employee Importance
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 * @author Kundan
 *
 */
public class EmployeeImportance {
	public int getImportance(List<Employee> employees, int id) {
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		for (Employee e : employees) {
			map.put(e.id, e);
		}

		int importance = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(id);

		while (!queue.isEmpty()) {
			int currentEmployee_id = queue.remove();
			Employee e = map.get(currentEmployee_id);
			importance += e.importance;
			List<Integer> subordinates = e.subordinates;
			if (subordinates.size() >= 1) {
				for (int i = 0; i < subordinates.size(); i++) {
					queue.add(subordinates.get(i));
				}
			}
		}

		return importance;

	}
}
