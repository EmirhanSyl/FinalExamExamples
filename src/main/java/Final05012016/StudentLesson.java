package Final05012016;


public abstract class StudentLesson implements ILesson{

    public String name;
    public int[] notlar;
    public GradeSystem gradeSystem;

    @Override
    public double GetAvarageGrade() {
        double total = 0;
        for(int i=0; i < notlar.length; i++){
            total += notlar[i];
        }
        return total / notlar.length;
    }
    
}
