package com.demo.xiaozhu.architecturecomponent.data.net;

import com.demo.xiaozhu.architecturecomponent.model.DemoInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IPInfoService {

    String DEMO_INFO_URL = "http://v5.pc.duomi.com/search-ajaxsearch-searchall";

    @GET(DEMO_INFO_URL)
    Call<DemoInfo> getIPInfo4Ali(@Query("kw") String Key, @Query("pi") int index, @Query("pz") int num);

}