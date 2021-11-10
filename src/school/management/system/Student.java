package school.management.system;

/**
 * class of student
 */
public class Student {

    private int id;

    private String name;

    private int grade;

    private int feesPaid;

    private int feesTotal;

    /**
     * To creat a new student
     * fees for every student is 30000 $
     * fees paid initially is 0
     * @param id
     * @param name
     * @param grade
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;

        this.feesTotal = 30000;
        this.feesPaid = 0;

    }

    /**
     * ID
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * NAME
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Grade
     * @return
     */
    public int getGrade() {
        return grade;
    }

    /**
     * FeesPaid
     * @return
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * FeesTotal
     * @return
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * update the student's gread
     * @param grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     *
     * @param fees
     */
    public void updateFeesPaid(int fees){
        feesPaid += fees;
        School.updateTotalMonyEarned(feesPaid);
    }

    /**
     *
     * @return
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :"+name+
                " Total fees paid so far $"+ feesPaid;
    }

}
