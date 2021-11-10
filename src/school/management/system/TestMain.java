package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        Teacher oualid = new Teacher(1,"Oualid",500);
        Teacher hassan = new Teacher(2,"hassan",700);
        Teacher killua = new Teacher(3,"killua",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(oualid);
        teacherList.add(hassan);
        teacherList.add(killua);


        Student ayoub = new Student(1,"Ayoub",4);
        Student lila = new Student(2,"lila",12);
        Student rabie = new Student(3,"Rabie",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(ayoub);
        studentList.add(rabie);
        studentList.add(lila);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        ayoub.updateFeesPaid(5000);
        lila.updateFeesPaid(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        oualid.receiveSalary(oualid.getSalary());
        System.out.println("GHS has spent for salary to " + oualid.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());

        killua.receiveSalary(killua.getSalary());
        System.out.println("GHS has spent for salary to " + killua.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(lila);

        hassan.receiveSalary(hassan.getSalary());

        System.out.println(hassan);
    }
}
