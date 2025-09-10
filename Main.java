public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[] {
                new Student(20, 3, 4, 20, 5, "Computer Science", 101),
                new Student(22, 5, 3, 35, 2, "Mechanical Engineering", 102),
                new Student(19, 2, 2, 15, 10, "Business", 103),
                new Student(24, 8, 5, 50, 0, "Law", 104),
                new Student(21, 4, 1, 25, 3, "Medicine", 105),
                new Student(23, 7, 6, 40, 1, "Architecture", 106),
                new Student(18, 1, 3, 10, 12, "Psychology", 107),
                new Student(25, 9, 4, 55, 0, "Physics", 108),
                new Student(20, 3, 2, 22, 4, "Mathematics", 109),
                new Student(21, 6, 3, 30, 2, "Philosophy", 110),
        };

        System.out.println("Original list of students:");
        SortAlgorithms.printStudents(students);

        // Bubble Sort by age ascending
        Student[] bubbleSorted = students.clone();
        SortAlgorithms.bubbleSortByAge(bubbleSorted);
        System.out.println("After Bubble Sort by age (ascending):");
        SortAlgorithms.printStudents(bubbleSorted);

        // Selection Sort by semester descending
        Student[] selectionSorted = students.clone();
        SortAlgorithms.selectionSortBySemester(selectionSorted);
        System.out.println("After Selection Sort by semester (descending):");
        SortAlgorithms.printStudents(selectionSorted);

        // Linear Search by programId
        int searchProgramId = 104;
        Student foundLinear = SearchAlgorithms.linearSearchByProgramId(students, searchProgramId);
        System.out.println("Linear Search for programId " + searchProgramId + ":");
        if (foundLinear != null) {
            System.out.println("Found student: " + foundLinear);
        } else {
            System.out.println("Student not found.");
        }
        System.out.println();

        // Binary Search by age (requires sorted by age)
        int searchAge = 21;
        System.out.println("Binary Search for age " + searchAge + ":");
        Student foundBinary = SearchAlgorithms.binarySearchByAge(bubbleSorted, searchAge);
        if (foundBinary != null) {
            System.out.println("Found student: " + foundBinary);
        } else {
            System.out.println("Student not found.");
        }
    }
}
