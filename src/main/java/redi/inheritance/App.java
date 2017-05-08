package redi.inheritance;

import java.util.Date;

/**
 * Created by redi on 5/8/17.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hallo Inheritance");
        Student student=new Student();
        Teacher teacher=new Teacher();
        student.setFirstName("Mustafa");
        student.setLastname("Fateh");
        teacher.setFirstName("abd");
        student.setDateOfBirth(new Date());
        System.out.println("Student Name is: "+ student.getFirstName() +" " +
                "last Name is:" + student.getLastname());

    }
}
