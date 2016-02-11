package school;

/**
 *
 * @author Teepop Ueangsawat
 */
public class Student {
    
    // attribute
    private int studentID;
    private String studentName;
    private Teacher advisor;
    
    // constructor
    public Student (int studentID, String studentName,Teacher advisor){
        setStudentID(studentID);
        setStudentName(studentName);
        setAdvisor(advisor);
    }
    
    // setter
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAdvisor(Teacher advisor) {
        this.advisor = advisor;
    }
    
    // getter
    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }
    
    public Teacher getAdvisor() {
        return advisor;
    }
  
}
