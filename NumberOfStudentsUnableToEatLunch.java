package easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NumberOfStudentsUnableToEatLunch {
	public static int countStudents(int[] students, int[] sandwiches) {
		int length = students.length;
		Queue<Integer> studentQueue = new LinkedList<>();
		Stack<Integer> sandwichStack = new Stack<>();
		for (int i = 0; i < length; i++) {
			studentQueue.add(students[i]);
		}

		for (int i = length - 1; i >= 0; i--) {
			sandwichStack.push(sandwiches[i]);
		}

		int counter = studentQueue.size() * studentQueue.size();

		while (counter > 0) {
			if (studentQueue.peek() == sandwichStack.peek()) {
				studentQueue.remove();
				if (studentQueue.size() == 0) {
					return 0;
				}
				sandwichStack.pop();
			} else {
				studentQueue.add(studentQueue.remove());
			}
			counter--;
		}

		return studentQueue.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] student = {1,1,0,0};
		int[] sandwich = {0,1,0,1};
		System.out.println(countStudents(student, sandwich));
	}

}
