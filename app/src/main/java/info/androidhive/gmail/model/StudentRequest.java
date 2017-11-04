package info.androidhive.gmail.model;

/**
 * Created by anurag on 4/11/17.
 */

public class StudentRequest {
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public StudentRequest(String studentID) {
        this.studentID = studentID;
    }

    private String studentID;

}
