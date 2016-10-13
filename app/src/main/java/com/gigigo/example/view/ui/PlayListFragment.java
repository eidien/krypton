package com.gigigo.example.view.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.gigigo.example.BuildConfig;
import com.gigigo.example.R;
import com.gigigo.example.interactor.PlayListInteractor;
import com.gigigo.example.model.Item;
import com.gigigo.example.model.PlayListItem;
import com.kripton.mvp.presenter.KPresenter;
import com.kripton.mvp.view.IView;
import com.kripton.mvp.view.ui.KFragment;

import java.util.ArrayList;

/**
 * Created by Daniel on 12/10/2016.
 */
public class PlayListFragment  extends KFragment implements IView{


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createPresenter();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_list,container,false);
        mPresenter.attachView(this);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPresenter.loadData(true);

    }



    @Override
    public void createPresenter() {
        PlayListInteractor  mInteractor= new PlayListInteractor();
        mPresenter = new KPresenter(mInteractor);
        mPresenter.setParams(new Object[]{BuildConfig.ID_USER,BuildConfig.KEY_GOOGLE});
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mPresenter.detachView();
    }

    @Override
    public void setProgressIndicator(boolean active) {
        PlayListItem item = new PlayListItem();
        item.items= null;
    }

    @Override
    public <PlayListItem> void showData(PlayListItem data) {

        
        Toast.makeText(getContext(),data.toString(),Toast.LENGTH_LONG).show();

    }

    @Override
    public void showError(Throwable exception) {
        Toast.makeText(getContext(),exception.toString(),Toast.LENGTH_LONG).show();

    }

    public  void getData(PlayListItem data){
        data.items = null;
    }


    @Override
    public void showFriendlyMessage(String response) {

    }
}
