package com.example.admin.myapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableArrayMap;

/**
 * Created by zjw on 2018/8/14.
 */
public class User extends BaseObservable{
    public String firstName;
    public String lastName;
    public boolean isShow;
    public ObservableArrayMap<String,String> map = new ObservableArrayMap<>();
//    public ObservableBoolean isShow;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        map.put("aaa","asdf");
        map.put("vd","sdf");
        map.put("dfga","fg");
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String name){
        firstName=name;
        notifyPropertyChanged(BR.firstName);
    }

    public String getLastName() {
        return this.lastName;
    }
//    @Bindable
    public boolean getIsShow() {
//    public ObservableBoolean getIsShow() {
        return this.isShow;
    }





    public void setLastName(String name){
        lastName=name;
        notifyChange();
    }

    public void setIsShow(boolean isShow){
//    public void setIsShow(ObservableBoolean isShow){
        this.isShow=isShow;
//        notifyPropertyChanged(BR.isShow);
    }

}

