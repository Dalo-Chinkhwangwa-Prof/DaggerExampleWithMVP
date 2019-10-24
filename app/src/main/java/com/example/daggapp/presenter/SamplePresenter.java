package com.example.daggapp.presenter;

public class SamplePresenter implements Contract.Presenter {

    private Contract.ViewContract theView;

    public SamplePresenter() {
    }

    @Override
    public void setViewContract(Contract.ViewContract theView) {
        this.theView = theView;
    }

    @Override
    public void toUpperCase(String name) {
        theView.displayName(name.toUpperCase());
    }

    @Override
    public void toLowerCase(String name) {
        theView.displayName(name.toLowerCase());
    }
}
