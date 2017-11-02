package info.androidhive.gmail.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by energywin4 on 2/11/2017.
 */

public class Student {
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    private String timestamp;
    private String picture;
    private boolean isImportant;
    private boolean isRead;
    private int color = -1;
    public String getPickupDate() {
        return PickupDate;
    }

    public void setPickupDate(String pickupDate) {
        PickupDate = pickupDate;
    }

    public String getNonguardianName() {
        return NonguardianName;
    }

    public void setNonguardianName(String nonguardianName) {
        NonguardianName = nonguardianName;
    }

    public String getNonguardianRelation() {
        return NonguardianRelation;
    }

    public void setNonguardianRelation(String nonguardianRelation) {
        NonguardianRelation = nonguardianRelation;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public String getNonguardianID() {
        return NonguardianID;
    }

    public void setNonguardianID(String nonguardianID) {
        NonguardianID = nonguardianID;
    }

    public String getID1() {
        return ID1;
    }

    public void setID1(String ID1) {
        this.ID1 = ID1;
    }
    @SerializedName("PickupDate")
    @Expose
    private String PickupDate;
    @SerializedName("NonguardianName")
    @Expose
    private String NonguardianName;
    @SerializedName("NonguardianRelation")
    @Expose
    private String NonguardianRelation;
    @SerializedName("ImageURL")
    @Expose
    private String ImageURL;
    @SerializedName("NonguardianID")
    @Expose
    private String NonguardianID;
    @SerializedName("ID1")
    @Expose
    private String ID1;

    @Override
    public String toString() {
        return "Post{" +
                "PickupDate='" + PickupDate + '\'' +
                ", NonguardianName='" + NonguardianName + '\'' +
                ", NonguardianRelation=" + NonguardianRelation +
                ", ImageURL=" + ImageURL + '\'' +
                ",NonguardianID="+NonguardianID + '\'' +
                ",ID1="+ ID1 +
                '}';
    }
}
