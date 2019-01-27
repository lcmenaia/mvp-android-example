package com.example.mvp_example.custom;

import com.example.mvp_example.exceptions.NullViewException;

public class Presenter<V> {

    private V view;

    public Presenter(V view){
        this.view = view;
    }

    public void setView(V view) {
        this.view = view;
    }

    public void removeView() {
        this.view = null;
    }

    public V getView() {

        //in case the view was destroyed but an async function is still call it
        if(this.view==null){
            throw new NullViewException();
        }
        return this.view;
    }
}
