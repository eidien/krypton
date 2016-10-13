package com.kripton.mvp.view;

import android.support.annotation.UiThread;

/**
 * Created by jgodinez on 6/20/2016.
 */
public interface IView {

    @UiThread
    void setProgressIndicator(boolean active);

    @UiThread
    <T> void  showData (T data);

    @UiThread
    void showError(Throwable exception);

    @UiThread
    void showFriendlyMessage(String response);
}