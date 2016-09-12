package com.gigigo.kripton.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by jgodinez on 6/20/2016.
 */
public interface IInteractor {
    String MESSAGE_FORMAT = "Status: %1$s\nMessage: %2$s";

    void getData(@NonNull ILoaderCallback callback);
    void refreshData();
}
