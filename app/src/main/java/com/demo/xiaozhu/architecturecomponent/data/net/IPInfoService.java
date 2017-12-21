package com.demo.xiaozhu.architecturecomponent.data.net;

import com.demo.xiaozhu.architecturecomponent.model.DemoInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IPInfoService {
    
   String DEMO_INFO_URL = "http://v5.pc.duomi.com/search-ajaxsearch-searchall?kw={key}&pi={index}&pz={num}";
   
    @GET(DEMO_INFO_URL)
    Call<DemoInfo> getIPInfo4Ali(@Path("key") String Key, @Path("index") int index, @Path("num") int num);
    
}