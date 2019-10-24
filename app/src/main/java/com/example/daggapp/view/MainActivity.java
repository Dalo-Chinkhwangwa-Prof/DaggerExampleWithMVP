package com.example.daggapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.daggapp.R;
import com.example.daggapp.di.component.DaggerPresenterComponent;
import com.example.daggapp.presenter.Contract;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity implements Contract.ViewContract {

    @Inject
    Contract.Presenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerPresenterComponent.create().inject(this);
        mainPresenter.setViewContract(this);
        mainPresenter.toUpperCase("dalo");
    }

    @Override
    public void displayName(String changedName) {
        Toast.makeText(this, "Changed name " + changedName, Toast.LENGTH_LONG).show();
    }
}
