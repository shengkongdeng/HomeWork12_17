package com.example.Service;

import com.example.Bean.BannerBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * 创建者: 走廊里の声控灯
 * 项目名: Round_One
 * 包名: com.example.Service
 * 创建时间: 2020/12/17 19:22
 */
public interface ApiService {
    String BASE_URL = "http://cdwan.cn:7000/";

    @GET
    Observable<BannerBean> getBannerData(@Url String url);
}
