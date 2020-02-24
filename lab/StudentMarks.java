package lab;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//lab 7  exercise4
public class StudentMarks {
	public static void main(String[] args) {
		StudentMarks example = new StudentMarks();
		example.ui();
	}

	public void ui() {
		Map<Integer, Integer> students = new HashMap<>();
		students.put(1, 90);
		students.put(2, 70);
		students.put(3, 33);
		students.put(4, 77);
		students.put(5, 88);
		Map<Integer, String> studentWithMedal = getStudents(students);
		System.out.println(studentWithMedal);
	}

	public Map<Integer, String> getStudents(Map<Integer, Integer> students) {
		Map<Integer, String> studentsWithMedal = new HashMap<>();
		Set<Integer> studentsRegistrationId = students.keySet();
		Iterator<Integer> iterator = studentsRegistrationId.iterator();
		while (iterator.hasNext()) {
			Integer studentRegistrationId = iterator.next();
			Integer studentMarks = students.get(studentRegistrationId);
			if (studentMarks >= 90) {
				studentsWithMedal.put(studentRegistrationId, "Gold");
			} else if (studentMarks >= 80 && studentMarks < 90) {
				studentsWithMedal.put(studentRegistrationId, "Silver");
			} else if (studentMarks >= 70 && studentMarks < 80) {
				studentsWithMedal.put(studentRegistrationId, "Bronze");
			} else {
				continue;
			}
		}
		return studentsWithMedal;
	}
}
