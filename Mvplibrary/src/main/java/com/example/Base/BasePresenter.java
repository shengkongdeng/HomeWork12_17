package com.example.Base;

import com.example.IBase.IBaseModel;
import com.example.IBase.IBasePresenter;
import com.example.IBase.IBaseView;

import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 创建者: 走廊里の声控灯
 * 项目名: Round_One
 * 包名: com.example.Base
 * 创建时间: 2020/12/17 17:19
 */
public abstract class BasePresenter<V extends IBaseView,M extends IBaseModel> implements IBasePresenter<V> {

    private WeakReference<V> mWeakReferenceView;
    private WeakReference<M> mWeakReferenceModel;
    private V mView;
    private M mModel;

    @Override
    public void onBindView(V v) {
        mWeakReferenceView = new WeakReference<V>(v);
        if (mWeakReferenceView!=null){
            mView = mWeakReferenceView.get();
        }
        if (createModel()!=null){
            mWeakReferenceModel = new WeakReference<M>(createModel());
            mModel = mWeakReferenceModel.get();
        }
    }

    private M createModel() {
        M mModel = null;
        Class<? extends BasePresenter> aClass = this.getClass();
        ParameterizedType genericSuperclass = (ParameterizedType) aClass.getGenericSuperclass();
        Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
        Class actualTypeArgument = (Class) actualTypeArguments[1];
        try {
            mModel = (M) actualTypeArgument.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return mModel;
    }

    @Override
    public void onUnBindView() {

    }

    public V getView() {
        return mView;
    }

    public M getModel() {
        return mModel;
    }
}
