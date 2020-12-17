package com.example.Contract;

import com.example.IBase.IBaseView;

/**
 * 创建者: 走廊里の声控灯
 * 项目名: Round_One
 * 包名: com.example.Contract
 * 创建时间: 2020/12/17 18:49
 */
public interface Contracts {
    interface ConfigView extends IBaseView {
        void onSuccess(Object data);
        void onError(String msg);
    }

    interface ConfigPresenter{
        void getData();
    }

    interface ConfigModel{
        void requestData();
    }
}
