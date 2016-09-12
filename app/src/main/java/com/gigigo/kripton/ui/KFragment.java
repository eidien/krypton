package com.gigigo.kripton.ui;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.gigigo.kripton.api.BasePresenter;
import com.gigigo.kripton.api.IView;
import com.gigigo.kripton.api.KDelegateCallback;

/**
 * Created by Daniel on 30/06/2016.
 */
public abstract class KFragment<V extends IView, P extends BasePresenter<V>> extends Fragment
        implements KDelegateCallback<V, P>, IView {

    protected P presenter;

    @Override  @NonNull
    public P getPresenter() {
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
