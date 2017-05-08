package redi.inheritance;

/**
 * Created by redi on 5/8/17.
 */
public class Student extends Person{
    private String attendedCourse ;

    public String getAttendedCourse() {
        return attendedCourse;
    }

    public void setAttendedCourse(String attendedCourse) {
        this.attendedCourse = attendedCourse;
    }
}
