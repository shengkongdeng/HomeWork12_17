package com.example.IBase;

/**
 * 创建者: 走廊里の声控灯
 * 项目名: Round_One
 * 包名: com.example.IBase
 * 创建时间: 2020/12/17 17:20
 */
public interface IBasePresenter<V> {
    void onBindView(V v);
    void onUnBindView();
    void onSuccess(Object data);
    void onError(String msg);
}
