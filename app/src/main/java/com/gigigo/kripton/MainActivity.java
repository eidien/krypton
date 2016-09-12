package com.gigigo.kripton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gigigo.kripton.api.IView;

public class MainActivity<T> extends AppCompatActivity implements IView<T>{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    @Override
    public void setProgressIndicator(boolean active) {

    }

    @Override
    public void showData(T data) {

    }

    @Override
    public void showError(Throwable exception) {

    }
}
