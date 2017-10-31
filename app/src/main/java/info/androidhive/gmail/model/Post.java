package info.androidhive.gmail.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by energywin4 on 31/10/2017.
 */

public class Post {

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    public Integer getSID() {
        return SID;
    }

    public void setSID(Integer SID) {
        this.SID = SID;
    }

    public Integer getPacketTime() {
        return packetTime;
    }

    public void setPacketTime(Integer packetTime) {
        this.packetTime = packetTime;
    }

    public Integer getEmailList() {
        return emailList;
    }

    public void setEmailList(Integer emailList) {
        this.emailList = emailList;
    }

    @SerializedName("alarmName")
    @Expose
    private String alarmName;
    @SerializedName("alarmType")
    @Expose
    private String alarmType;
    @SerializedName("SID")
    @Expose
    private Integer SID;
    @SerializedName("packetTime")
    @Expose
    private Integer packetTime;
    @SerializedName("emailList")
    @Expose
    private Integer emailList;



    @Override
    public String toString() {
        return "Post{" +
                "alarmName='" + alarmName + '\'' +
                ", alarmType='" + alarmType + '\'' +
                ", SID=" + SID +
                ", packetTime=" + packetTime + '\'' +
                ",emailList="+emailList +
                '}';
    }
}
