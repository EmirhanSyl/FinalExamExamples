package Final05012016;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Student{
    
    ArrayList<StudentLesson> lessons = new ArrayList<>();
    
    String firstName;
    String lastName;
    String faculty;
    
    public Student(){}
    
    public Student(String firstName, String lastName, String faculty){
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
    }
    
    double GetEverageGrade(){
        int total = 0;
        for (StudentLesson lesson : lessons) {
            total += lesson.GetAvarageGrade();
        }
        return total / lessons.size();
    }
    
}
