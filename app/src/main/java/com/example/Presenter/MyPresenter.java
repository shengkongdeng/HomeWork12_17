package com.example.Presenter;

import com.example.Base.BasePresenter;
import com.example.Contract.Contracts;
import com.example.Model.MyModel;

/**
 * 创建者: 走廊里の声控灯
 * 项目名: Round_One
 * 包名: com.example.Presenter
 * 创建时间: 2020/12/17 18:45
 */
public class MyPresenter extends BasePresenter<Contracts.ConfigView, MyModel> implements Contracts.ConfigPresenter {
    @Override
    public void getData() {
        getModel().requestData(this);
    }

    @Override
    public void onSuccess(Object data) {
        getView().onSuccess(data);
    }

    @Override
    public void onError(String msg) {
        getView().onError(msg);
    }
}
