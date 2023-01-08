package Final05012016;

/**
 *
 * @author emirs
 */
public class DataStructures extends StudentLesson{

    @Override
    public String GetLetterGrade(GradeSystem gradeSystem) {
        if (gradeSystem.hundered == true && super.GetAvarageGrade() > 90) {
            return "AA";
        }
        else{
            return "XX";
        }
    }


    @Override
    public String GetLetterGrade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
}
