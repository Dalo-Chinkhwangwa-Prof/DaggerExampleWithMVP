package com.example.daggapp.di.module;

import com.example.daggapp.presenter.Contract;
import com.example.daggapp.presenter.SamplePresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {

    @Provides
    @Singleton
    public Contract.Presenter provideMyPresenter(){
        return new SamplePresenter();
    }
}
