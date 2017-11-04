package info.androidhive.gmail.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PassHistory {

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
    private Integer nonguardianID;
    @SerializedName("Student")
    @Expose
    private Object student;
    @SerializedName("ID1")
    @Expose
    private Integer iD1;

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

    public Integer getNonguardianID() {
        return nonguardianID;
    }

    public void setNonguardianID(Integer nonguardianID) {
        this.nonguardianID = nonguardianID;
    }

    public Object getStudent() {
        return student;
    }

    public void setStudent(Object student) {
        this.student = student;
    }

    public Integer getID1() {
        return iD1;
    }

    public void setID1(Integer iD1) {
        this.iD1 = iD1;
    }

}