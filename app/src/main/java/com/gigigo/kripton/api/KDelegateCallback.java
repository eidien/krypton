package com.gigigo.kripton.api;

/**
 * Created by mgalicia on 8/11/16.
 */
public interface KDelegateCallback<V extends IView, P extends BasePresenter<V>> {

    public P createPresenter();
    public P getPresenter();
    public void setPresenter(P presenter);
    public V getIView();

}

