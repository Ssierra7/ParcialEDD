public class SortAlgorithms {

    // Bubble Sort by age (ascending)
    public static void bubbleSortByAge(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getAge() > students[j + 1].getAge()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort by semester (descending)
    public static void selectionSortBySemester(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (students[j].getSemester() > students[maxIdx].getSemester()) {
                    maxIdx = j;
                }
            }
            Student temp = students[maxIdx];
            students[maxIdx] = students[i];
            students[i] = temp;
        }
    }

    // Utility method to print array of students
    public static void printStudents(Student[] students) {
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }
}
