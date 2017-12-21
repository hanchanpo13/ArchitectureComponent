package com.demo.xiaozhu.architecturecomponent.data.repository;

import android.util.Log;

import com.demo.xiaozhu.architecturecomponent.data.net.IPInfoService;
import com.demo.xiaozhu.architecturecomponent.model.DemoInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IPInfoRepository {

    private static Retrofit sRetrofit;

    static {

        Gson gson = new GsonBuilder()
                //配置你的Gson
                .setDateFormat("yyyy-MM-dd hh:mm:ss")
                .serializeNulls()
                .create();

        // Log信息拦截器
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);//这里可以选择拦截级别

        //OkHttpClient
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(loggingInterceptor);
        sRetrofit = new Retrofit.Builder()
                .baseUrl("http://ip.taobao.com/")
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

    }

    private IPInfoService IPInfoservice = sRetrofit.create(IPInfoService.class);


    public IPInfoRepository(DataCallBack<DemoInfo> callBack) {
        this.callBack = callBack;
    }

    private DataCallBack callBack;

    public void requestData() {
        IPInfoservice.getIPInfo4Ali("热门", 1, 10).enqueue(new Callback<DemoInfo>() {
            @Override
            public void onResponse(Call<DemoInfo> call, Response<DemoInfo> response) {
                callBack.onDataBack(response.body());
            }

            @Override
            public void onFailure(Call<DemoInfo> call, Throwable t) {
                Log.e("jeven", t.getMessage());
                t.printStackTrace();
            }
        });
    }


}