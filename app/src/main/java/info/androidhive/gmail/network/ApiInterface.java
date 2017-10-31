package info.androidhive.gmail.network;

import java.util.List;

import info.androidhive.gmail.model.Message;
import info.androidhive.gmail.model.Post;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface ApiInterface {
    @POST("/api")
    @FormUrlEncoded
    Call<Post> savePost(@Field("deviceType") String deviceType,
                        @Field("SID") String SID,
                        @Field("userName") String userName,
                        @Field("password") String password);
}