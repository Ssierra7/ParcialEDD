public class SearchAlgorithms {

    // Linear Search by programId
    public static Student linearSearchByProgramId(Student[] students, int programId) {
        for (Student s : students) {
            if (s.getProgramId() == programId) {
                return s;
            }
        }
        return null;
    }

    // Binary Search by age (array must be sorted by age ascending)
    public static Student binarySearchByAge(Student[] students, int age) {
        int left = 0;
        int right = students.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (students[mid].getAge() == age) {
                return students[mid];
            } else if (students[mid].getAge() < age) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return null;
    }
}
