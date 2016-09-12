package com.gigigo.kripton.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.gigigo.kripton.api.BasePresenter;
import com.gigigo.kripton.api.IView;
import com.gigigo.kripton.api.KDelegateCallback;

/**
 * Created by Daniel on 30/06/2016.
 */
public abstract class KActivity<V extends IView, P extends BasePresenter<V>> extends AppCompatActivity implements KDelegateCallback<V, P>,IView{

    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getLayoutId());
    }

    @Override  @NonNull public P getPresenter() {
        return presenter;
    }

    @Override public void setPresenter(P presenter) {
        this.presenter = presenter;
    }

    @Override public V getIView() {
        return (V) this;
    }

    public abstract int getLayoutId();
    public abstract P createPresenter();

}
