package info.androidhive.gmail.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("studentID")
    @Expose
    private String studentID;
    @SerializedName("passHistory")
    @Expose
    private List<PassHistory> passHistory = null;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public List<PassHistory> getPassHistory() {
        return passHistory;
    }

    public void setPassHistory(List<PassHistory> passHistory) {
        this.passHistory = passHistory;
    }

}