package com.example.round_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.Base.BaseMvpActivity;
import com.example.Base.BasePresenter;

public class MainActivity extends BaseMvpActivity {

    @Override
    protected BasePresenter setUpPresenter() {
        return new My;
    }

    @Override
    protected int setUpLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }
}