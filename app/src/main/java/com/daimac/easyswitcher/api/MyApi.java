package com.daimac.easyswitcher.api;

import com.daimac.easyswitcher.model.response.LoginResponse;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Api接口
 * Created by LiuZhenXing on 2017/9/23.
 */

public interface MyApi {
    public static final String BASE_URL = "http://192.168.0.111:8080/api/v1/";

    //发送验证码
    @POST("user/login")
    Observable<LoginResponse> login(@Body RequestBody body);

    @POST("user/login")
    Observable<LoginResponse> login2(@Query("username") String username, @Query("password") String password);

}
