package com.gigigo.kripton.api;

/**
 * Created by mgalicia on 9/6/16.
 */
public interface ICustomInteractor extends IInteractor {

    void setOperationType(int operationType);
    void setParams(Object... params);
}
