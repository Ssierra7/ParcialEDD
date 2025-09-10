public class Student {
    private int age;
    private int semester;
    private int socioEconomicStratum;
    private int coursesCompleted;
    private int coursesPending;
    private String program;
    private int programId;

    public Student(int age, int semester, int socioEconomicStratum, int coursesCompleted, int coursesPending, String program, int programId) {
        this.age = age;
        this.semester = semester;
        this.socioEconomicStratum = socioEconomicStratum;
        this.coursesCompleted = coursesCompleted;
        this.coursesPending = coursesPending;
        this.program = program;
        this.programId = programId;
    }

    // Getters
    public int getAge() { return age; }
    public int getSemester() { return semester; }
    public int getSocioEconomicStratum() { return socioEconomicStratum; }
    public int getCoursesCompleted() { return coursesCompleted; }
    public int getCoursesPending() { return coursesPending; }
    public String getProgram() { return program; }
    public int getProgramId() { return programId; }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", semester=" + semester +
                ", socioEconomicStratum=" + socioEconomicStratum +
                ", coursesCompleted=" + coursesCompleted +
                ", coursesPending=" + coursesPending +
                ", program='" + program + '\'' +
                ", programId=" + programId +
                '}';
    }
}
