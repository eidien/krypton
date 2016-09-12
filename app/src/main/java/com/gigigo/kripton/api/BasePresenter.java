package com.gigigo.kripton.api;

import android.support.annotation.UiThread;

import java.lang.ref.WeakReference;

/**
 * Created by mgalicia on 8/10/16.
 */
public class BasePresenter<V extends IView>{

    private WeakReference<V> viewRef;

    @UiThread
    public  void attachView(V view) { viewRef = new WeakReference<V>(view);}

    public void detachView() {
        if (viewRef != null) {
            viewRef.clear();
            viewRef = null;
        }
    }

    public boolean isViewAttached(){return viewRef != null && viewRef.get() != null;}

    @UiThread
    public V getView() {
        return viewRef == null ? null : viewRef.get();
    }
}


