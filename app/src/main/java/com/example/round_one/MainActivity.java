package com.example.round_one;

import android.view.View;
import android.widget.TextView;

import com.example.Base.BaseMvpActivity;
import com.example.Base.BasePresenter;
import com.example.Contract.Contracts;
import com.example.Model.MyModel;
import com.example.Presenter.MyPresenter;

public class MainActivity extends BaseMvpActivity<Contracts.ConfigView,MyPresenter, MyModel> implements Contracts.ConfigView, View.OnClickListener {

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

        activity_main_helloWorld.setOnClickListener(this);
    }

    @Override
    public void onSuccess(Object data) {

    }

    @Override
    public void onError(String msg) {

    }

    @Override
    public void onClick(View v) {
        activity_main_helloWorld.setText("");
    }
}