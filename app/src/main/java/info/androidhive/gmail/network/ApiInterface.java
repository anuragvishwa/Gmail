package info.androidhive.gmail.network;

import info.androidhive.gmail.model.Student;
import info.androidhive.gmail.model.StudentRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface ApiInterface {
   /* @POST("/api")
    @FormUrlEncoded
    Call<List<Post>> savePost(@Field("deviceType") String deviceType,
                        @Field("SID") String SID,
                        @Field("userName") String userName,
                        @Field("password") String password);
}*/

    @POST("getPassHistory")
    @Headers({"appkey:kjshjsdhsjhdsjdhsjhd","token:jkshsjadhsjdhsjhd"})
    Call<Student> getPassHistory(@Body StudentRequest studentRequest);
}


/*
public interface ApiInterface {
    @GET("inbox.json")
    Call<List<Message>> getInbox();
}*/
