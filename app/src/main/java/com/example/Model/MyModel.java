package com.example.Model;

import com.example.Base.BaseModel;
import com.example.Bean.BannerBean;
import com.example.Contract.Contracts;
import com.example.IBase.IBasePresenter;
import com.example.Service.ApiService;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 创建者: 走廊里の声控灯
 * 项目名: Round_One
 * 包名: com.example.Model
 * 创建时间: 2020/12/17 18:45
 */
public class MyModel extends BaseModel implements Contracts.ConfigModel {

    @Override
    public void requestData(final IBasePresenter p) {

        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        Retrofit build = new Retrofit.Builder()
                .baseUrl(ApiService.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = build.create(ApiService.class);
        Observable<BannerBean> bannerData = apiService.getBannerData("exam2003/abannerlist.json");
        bannerData.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BannerBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BannerBean bannerBean) {
                        p.onSuccess(bannerBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        p.onError(e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
