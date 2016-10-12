package com.gigigo.kripton;

import android.os.Bundle;

import com.kripton.mvp.presenter.KPresenter;
import com.kripton.mvp.view.IView;
import com.kripton.mvp.view.ui.KActivity;


public class MainActivity extends KActivity  implements IView {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createPresenter();
        mPresenter.loadData(true);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public void createPresenter() {
        MyInteractor interactor = new MyInteractor();

        mPresenter = new KPresenter(interactor);
        mPresenter.attachView(this);
        mPresenter.setParams(new Object[] { "TEST" });
    }

    @Override
    public int getLayoutId() {
        return 0;
    }


    @Override
    public void setProgressIndicator(boolean active) {

    }

    @Override
    public <T> void showData(T data) {

    }

    @Override
    public void showError(Throwable exception) {

    }

    @Override
    public void showFriendlyMessage(String response) {

    }

}
