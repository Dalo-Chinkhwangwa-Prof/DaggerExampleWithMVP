package com.example.daggapp.di.component;

import com.example.daggapp.di.module.PresenterModule;
import com.example.daggapp.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {PresenterModule.class})
public interface PresenterComponent {
    void inject(MainActivity mainActivity);
}
