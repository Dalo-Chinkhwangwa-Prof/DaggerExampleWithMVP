package com.example.daggapp.presenter;

public interface Contract {

    interface Presenter {
        void toUpperCase(String name);

        void toLowerCase(String name);

        void setViewContract(ViewContract view);
    }

    interface ViewContract {
        void displayName(String changedName);
    }
}
