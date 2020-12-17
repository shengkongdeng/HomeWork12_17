package com.example.round_one;

import android.widget.TextView;

import com.example.Base.BaseMvpActivity;
import com.example.Contract.Contracts;
import com.example.Model.MyModel;
import com.example.Presenter.MyPresenter;

public class MainActivity extends BaseMvpActivity<Contracts.ConfigView,MyPresenter, MyModel> implements Contracts.ConfigView {

    private TextView activity_main_helloWorld;

    @Override
    protected MyPresenter setUpPresenter() {
        return new MyPresenter();
    }

    @Override
    protected int setUpLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        mPresenter.getData();
    }

    @Override
    protected void initView() {
        activity_main_helloWorld = findViewById(R.id.activity_main_helloWorld);
    }

    @Override
    public void onSuccess(Object data) {
        activity_main_helloWorld.setText(data.toString());
    }

    @Override
    public void onError(String msg) {
        activity_main_helloWorld.setText(msg);
    }
}