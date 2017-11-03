

        package info.androidhive.gmail.model;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

        import java.util.List;

        class PassHistory {

    @SerializedName("PickupDate")
    @Expose
    private String pickupDate;
    @SerializedName("NonguardianName")
    @Expose
    private String nonguardianName;
    @SerializedName("NonguardianRelation")
    @Expose
    private String nonguardianRelation;
    @SerializedName("ImageURL")
    @Expose
    private String imageURL;
    @SerializedName("NonguardianID")
    @Expose
    private int nonguardianID;
    @SerializedName("Student")
    @Expose
    private Object student;
    @SerializedName("ID1")
    @Expose
    private int iD1;

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getNonguardianName() {
        return nonguardianName;
    }

    public void setNonguardianName(String nonguardianName) {
        this.nonguardianName = nonguardianName;
    }

    public String getNonguardianRelation() {
        return nonguardianRelation;
    }

    public void setNonguardianRelation(String nonguardianRelation) {
        this.nonguardianRelation = nonguardianRelation;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getNonguardianID() {
        return nonguardianID;
    }

    public void setNonguardianID(int nonguardianID) {
        this.nonguardianID = nonguardianID;
    }

    public Object getStudent() {
        return student;
    }

    public void setStudent(Object student) {
        this.student = student;
    }

    public int getID1() {
        return iD1;
    }

    public void setID1(int iD1) {
        this.iD1 = iD1;
    }

}


class Response {

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


class Status {

    @SerializedName("resCode")
    @Expose
    private int resCode;
    @SerializedName("resMsg")
    @Expose
    private String resMsg;

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

}

public class Student {

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("response")
    @Expose
    private Response response;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

}