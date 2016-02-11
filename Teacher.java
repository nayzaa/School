package school;

/**
 *
 * @author Teepop Ueangsawat
 */
public class Teacher {
    
    // attribute
    private int teacherID;
    private String teacherName;
    
    // constructor
    public Teacher (int teacherID, String teacherName){
        setTeacherID(teacherID);
        setTeacherName(teacherName);
    }
    
    // setter

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    
    // getter

    public int getTeacherID() {
        return teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }
    
}
