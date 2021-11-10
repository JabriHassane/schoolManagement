package school.management.system;

import java.util.List;

/**
 * School Class
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static  int totalMoneySpent;

    /**
     * new School object
     * @param teachers
     * @param students
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * List of teachers
     * @return
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     *updat
     * @param teachers
     */
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    /**
     * add a teacher
     * @param teacher
     */
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    /**
     *
     * @return
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *
     * @param students
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * add a student
     * @param student
     */
    public void addStudent(Student student){
        students.add(student);
    }
    /**
     *
     * @return
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *
     * @param totalMoneyEarned
     */
    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    /**
     *
     * @param monyEarned
     */
    public static void updateTotalMonyEarned(int monyEarned){
        totalMoneyEarned += monyEarned;
    }

    /**
     *
     * @return
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *
     * @param totalMoneySpent
     */
    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }

    /**
     *Updeat the money that is spent by the school which
     * is the salary given by the scool to its teachers
     * @param moneySpent
     */
    public static void updateTotalMoneySpent(int moneySpent){
        totalMoneyEarned -= moneySpent;
    }
}
