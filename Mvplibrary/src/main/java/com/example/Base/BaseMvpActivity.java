package com.example.Base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.IBase.IBaseModel;
import com.example.IBase.IBaseView;

/**
 * 创建者: 走廊里の声控灯
 * 项目名: Round_One
 * 包名: com.example.Base
 * 创建时间: 2020/12/17 17:18
 */
public abstract class BaseMvpActivity<V extends IBaseView,P extends BasePresenter<V,M>,M extends IBaseModel> extends AppCompatActivity implements IBaseView {

    private P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setUpLayout());
        mPresenter = setUpPresenter();
        mPresenter.onBindView((V) this);
        initView();
        initData();
    }

    protected abstract P setUpPresenter();

    protected abstract int setUpLayout();

    protected abstract void initData();

    protected abstract void initView();
}
