package school.management.system;

/**
 * teachers class
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * creat a new teacher
     * @param id
     * @param name
     * @param salary
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        salaryEarned = 0;
    }

    /**
     * return Id
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * return name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * return salary
     * @return
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Updat the salary
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Student's name :"+name+
                " Total fees paid so far $"+ salary;
    }
}
