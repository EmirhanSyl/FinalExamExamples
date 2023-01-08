package Final05012016;

/**
 *
 * @author emirs
 */
public class Test {
    
    
    public static void main(String[] args) {
        Student stu = new Student();
        
        StudentLesson math = new Math();
        int[] notlar = {100, 100, 100};
        math.notlar = notlar;
        
        StudentLesson dataS = new DataStructures();
        int[] notlar2 = {100, 100, 100};
        dataS.notlar = notlar2;
        
        stu.lessons.add(math);
        stu.lessons.add(dataS);
        System.out.println(stu.GetEverageGrade());
        
        
        Student stu1 = new Student();
        stu1.firstName = "Emirhan";
        stu1.lastName = "Soylu";
        stu1.faculty = "Software";
        
        Student stu2 = new Student("Asım", "Kutluer", "Software");
        
        
    }
}
